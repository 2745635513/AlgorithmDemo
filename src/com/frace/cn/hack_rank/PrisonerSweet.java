package com.frace.cn.hack_rank;

import java.util.Scanner;

public class PrisonerSweet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            if((s-1+m)%n==0){
                System.out.println(n);
            }else {
                System.out.println((s-1+m)%n);
            }
            continue;
        }
    }
}
