package com.frace.cn.hack_rank;

import java.util.Scanner;

public class PickingNumber {
    public static void main(String[] args) {
        //从一组整数中找出一组数据每个数据之间相差为一
        //思路：先找出重复数最多的数值，然后寻找向上加一和向下减一的数，查看数量，取大值，缺点是：有可能这种情况个数之和不是最大的，
        //正确思路：输出的值大小不关心，需要记录下数据的重复次数，找出相邻的两个数最大值。
        //取重复数多的方法：
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] vals = new int[100];
        for(int i = 0 ;i <n;i++){
            int val = in.nextInt();
            vals[val-1]++;
        }
        int max =0;
        int temp =0;
        for(int j =0;j<99;j++){
            temp = vals[j]+vals[j+1];
            if (temp > max){
                max = temp;
            }
        }
        System.out.println(max);
    }
}
