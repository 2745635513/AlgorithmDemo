package com.frace.cn.hack_rank;

import java.util.*;

public class BonAppetit {
    /**
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int i = in.nextInt();
        int sum = 0;
        for ( int j = 0 ; j < length ;j++){
            if(j!=i){
                sum+=in.nextInt();
            }else{
                int a=in.nextInt();
            }
        }
        if(in.nextInt() == sum / 2){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(in.nextInt() - sum);
        }
    }
}
