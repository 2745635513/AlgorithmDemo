package com.frace.cn.hack_rank;

import java.util.Scanner;

public class BeautilfulDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int divisible = in.nextInt();
        int count = 0;
        for (int i = start;i<=end;i++){
            int temp = i;
            int length = (i+"").length();
            int[] datas = new int[length];
            for(int j = 0;j<length;j++){
                datas[j] = temp % 10;
                temp =temp / 10;
            }
            String value="";
            for (int m = 0 ; m<datas.length;m++){
                value += datas[m]+"";
            }
            if (Math.abs(Integer.parseInt(value)-i) ==0){
                count++;
            }else if (Math.abs(Integer.parseInt(value)-i)%divisible == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
