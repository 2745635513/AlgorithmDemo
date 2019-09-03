package com.frace.cn.hack_rank;

import java.util.Scanner;

public class ElectronicShop {
    public static void main(String[] args) {
        //这个牵扯到两个数组的遍历相加得出最大值
        Scanner in = new Scanner(System.in);
        int nums = in.nextInt();
        int keyNum = in.nextInt();
        int driverNmu = in.nextInt();
        int[] keyVal=new int[keyNum];
        int[] driverVal = new int[driverNmu];
        for (int k =0;k<keyNum;k++){
            keyVal[k] = in.nextInt();
        }
        for (int p =0;p<driverNmu;p++){
            driverVal[p] = in.nextInt();
        }
        int max = 0;
        for(int i = 0;i<keyNum;i++){
            for(int j = 0 ; j <driverNmu;j++){
                if(keyVal[i]+driverVal[j]<=nums){
                    max = keyVal[i] + driverVal[j];
                }
            }
        }
        System.out.println(max == 0 ? -1 : max);
    }
}
