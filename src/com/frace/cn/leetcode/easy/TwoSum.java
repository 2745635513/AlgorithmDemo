package com.frace.cn.leetcode.easy;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for (int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]+ nums[j] == target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        for (int i=0;i<2;i++){
            System.out.println(result[i]);
        }
        return result;
    }
    public static void main(String[] args) {
       int[] nums = {2,5,5,11};
      int target = 10;
       twoSum(nums, target);
    }
}
