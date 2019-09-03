package com.frace.cn.hack_rank;

public class DivisibleSumPairs {
public static void main(String[] args) {
	 
	int n =6;
	int k = 3;
	int ar[] = new int[] {12,2,23,4,5,1};
	int result = 0;
	 
     
     for(int i =0;i<n;i++){
         for(int j = i+1;j<n;j++){
             int sum =0;
             sum = ar[i]+ar[j];
             if(sum % k == 0){
                 result ++;
             }
         }
     }
     System.out.println(result);
}
}
