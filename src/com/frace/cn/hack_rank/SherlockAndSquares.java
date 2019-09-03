package com.frace.cn.hack_rank;

import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] square = new int[31622];
        //易犯错的点：第一个完全平方数应该是1，而不是0
        for(int j=1;j<=square.length;j++) {
        	square[j-1] = j*j;
        }
        int n = scanner.nextInt();
        for (int i =0;i<n;i++){
            int count =0;
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            for (int k =0;k< square.length;k++){
            	if(square[k]>=n1 && square[k]<=n2) {
            		count++;
            	}
            }
            System.out.println(count);
        }
        scanner.close();
    	
    }

}
