package com.frace.cn.hack_rank;

import java.util.Scanner;

public class JumpCloud {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 100;
        int[] c = new int[n];
        for (int i = 0 ; i<n;i++){
            c[i] = scanner.nextInt();
        }
        for (int j = 0;j<n;j=j+k){
            if (c[j]==1){
                result -= 3;
            }else {
                result -=1;
            }
        }
        System.out.println(result);
    }
}
