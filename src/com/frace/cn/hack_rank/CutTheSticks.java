package com.frace.cn.hack_rank;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class CutTheSticks {
    public static void main(String[] args) {
    	//完美解决
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> record = new ArrayList<>();

        for (int i =0;i<n;i++){
        	int value =scanner.nextInt();
            list.add(value);
            record.add(value);
        }
        Collections.sort(list);
        Collections.sort(record);
        while(record.size()>0) {
        	for (int j=0;j<list.size();j++){
            	int min = list.get(0); 
            	int val =record.get(j)-min;
            	record.set(j, val);
            }
        	System.out.println(record.size());
//        	for(int k=0;k<record.size();k++) {
//        		if(record.get(k) == 0) {
//        			record.remove(k);
//        		}
//        	}
        	Iterator<Integer> it = record.iterator();
        	while(it.hasNext()) {
        		if(it.next() ==0) {
        			it.remove();
        		}
        	}
            try {
    			list=deepCopy(record);
    		} catch (ClassNotFoundException e) {
    			e.printStackTrace();
    			System.out.println(e);
    		} catch (IOException e) {
    			e.printStackTrace();
    			System.out.println(e);
    		} 
        }
        
        
        scanner.close();

    }
    
    public static <T> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {  
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();  
        ObjectOutputStream out = new ObjectOutputStream(byteOut);  
        out.writeObject(src);  
     
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());  
        ObjectInputStream in = new ObjectInputStream(byteIn);  
        @SuppressWarnings("unchecked")  
        List<T> dest = (List<T>) in.readObject();  
        return dest;  
    }  
}
