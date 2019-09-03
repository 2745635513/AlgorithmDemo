package com.frace.cn.hack_rank;

import java.util.Scanner;

public class Staircase {

	static void staircase(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = n ; j > i ;j--){
            	System.out.print(" ");
            }
            for(int k=i;k>0;k--) {
            	System.out.print("#");
            }
            	System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
