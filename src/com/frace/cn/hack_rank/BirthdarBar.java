package com.frace.cn.hack_rank;

import java.util.ArrayList;
import java.util.List;

public class BirthdarBar {

	public static void main(String[] args) {
		int d = 3;
		int m =2;
		List<Integer> s = new ArrayList<>();
		s.add(0, 1);
		s.add(1, 2);
		s.add(2, 1);
		s.add(3, 3);
		s.add(4, 2);
		if(s.size() == 1 && s.get(0) == d && m==1){
            System.out.println(1);
        }
        int n = s.size();
        List<Integer> resu = new ArrayList<>();
        for(int i =0; i < n ;i++){
        	if(i + m <= n) {
        		int sum = 0;
                for(int j =i;j<m;j++){
                    sum+=s.get(j);
                }
                resu.add(i, sum);
        	}
            
        }
        int result = 0;
        for(int k =0;k<resu.size();k++){
            if(resu.get(k) == d){
                result ++;
            }
        }
        System.out.println(result);
	}
}
