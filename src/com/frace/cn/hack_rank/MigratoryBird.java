package com.frace.cn.hack_rank;

import java.util.*;

public class MigratoryBird {
	public static void main(String[] args) {
//		List<Integer> valueList = new ArrayList<>();
//		List<Integer> countList = new ArrayList<>();

//		List<Integer> arr = new ArrayList<>();
//		arr.add(1);
//		arr.add(4);
//		arr.add(4);
//		arr.add(4);
//		arr.add(4);
//		arr.add(5);
//		arr.add(3);
//		arr.add(2);
//        List<Integer> valueList1 = new ArrayList<>(valueList);
//        List<Integer> countList1 = new ArrayList<>(countList);
//        
//        int maxCount =Collections.max(countList1);
//        int numbers =Collections.frequency(countList1, maxCount);
//        List<Integer> resultList = new LinkedList<>();
//        int resu = valueList.get(countList1.indexOf(maxCount));
//        if(numbers >1 ) {
//            for (int j = 0 ; j < countList1.size();j++) {
//                if(countList1.get(j) == maxCount) {
//                    resultList.add(valueList1.get(j));
//                }
//            }
//            resu = Collections.min(resultList);
//        }
//		
//		System.out.println(resu);
			Scanner in = new Scanner(System.in);
	        int n = in.nextInt();//第一个输入的数作为长度
	        int[] typeCounts = new int[5];//因为只有1-5五个数，所以长度固定
	        for (int i = 0; i < n; i++) {
	            int typ = in.nextInt();
	            typeCounts[typ-1]++;//计数
	        }
	        int maxCount = 0;
	        int maxType = 0;
	        for (int i = 0; i < 5; i++) {
	            if(typeCounts[i]>maxCount) {
	                maxCount = typeCounts[i];
	                maxType = i+1;
	            }
	        }
	        System.out.println(maxType);
	    }
	 // Complete the migratoryBirds function below.
//    static int migratoryBirds(List<Integer> arr) {
//        List<Integer> valueList1 = new LinkedList<>();
//        List<Integer> countList1 = new LinkedList<>();
//        for (int i = 0; i < arr.size(); i++) {
//            int count = Collections.frequency(arr, arr.get(i));
//            if (!valueList1.contains(arr.get(i))) {
//                valueList1.add(arr.get(i));
//                countList1.add(count);
//            }
//        }
//         List<Integer> valueList = new ArrayList<>(valueList1);
//        List<Integer> countList = new ArrayList<>(countList1);
//
//        int maxCount =Collections.max(countList);
//        int numbers =Collections.frequency(countList, maxCount);
//        List<Integer> resultList = new ArrayList<>();
//        int resu = valueList.get(countList.indexOf(maxCount));
//        if(numbers >1 ) {
//            for (int j = 0 ; j < countList.size();j++) {
//                if(countList.get(j) == maxCount) {
//                    resultList.add(valueList.get(j));
//                }
//            }
//        resu = Collections.min(resultList);
//        }
//        return resu;
//
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < arrCount; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr.add(arrItem);
//        }
//
//        int result = migratoryBirds(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
}
