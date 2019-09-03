package com.frace.cn.hack_rank;

import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] values = new int[100];
        int result = 0;
        for(int i = 0 ; i< length;i++){
            int value = in.nextInt();
            values[value-1]++;
            if(values[value-1] ==2){
                result++;
                values[value-1] =0;
            }
        }
        System.out.println(result);
    }
}
