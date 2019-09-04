package com.frace.cn.leetcode.easy;

public class maxSubArray {

    public static int maxSubArray(int[] nums) {
        //动态规划
        //算法
        int sum =0;
        int record=nums[0];
        for (int num:
             nums) {
            if (sum>0){
                sum+=num;
            }else {
                sum=num;
            }
            record=Math.max(sum,record);
        }
        return record;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-1,-2147483648,-3,2}));
    }
}
