package com.frace.cn.hack_rank;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int goal = in.nextInt();
        int min = 1;
        int max = 1;
        if (length - goal ==1){
            if (length % 2 != 0 && goal % 2 == 0){
                System.out.println(0);
            }else if (length % 2 == 0 && goal % 2 != 0){
                System.out.println(1);
            }
        }
        else if (length == goal || goal == 1){
            System.out.println(0);
        }else {
            min = goal / 2;
            max = (length - goal)/2;
            if(min < max){
                System.out.println(min);
            }else{
                System.out.println(max);
            }
        }
    }
}
