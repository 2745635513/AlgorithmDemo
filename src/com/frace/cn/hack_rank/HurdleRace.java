package com.frace.cn.hack_rank;

import java.util.Scanner;

public class HurdleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height = in.nextInt();
        int temp = 0;
        for (int i = 0 ; i <n;i++){
            int hurdel = in.nextInt();
            if(hurdel > temp){
                temp = hurdel;
            }
        }
        if(temp > height){
            System.out.println(temp-height);
        }else {
            System.out.println(0);
        }
    }
}
