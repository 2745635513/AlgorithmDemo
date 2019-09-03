package com.frace.cn.hack_rank;

import java.util.Scanner;

public class AdShareNums {
    public static void main(String[] args) {
        Scanner nex = new Scanner(System.in);
        int n = nex.nextInt();
        int Count =0;
        int shared = 5;
        for (int i=0;i<n;i++){
            int linked = shared / 2;
            Count += linked;
            shared = linked * 3;
        }
        System.out.println(Count);
    }
}
