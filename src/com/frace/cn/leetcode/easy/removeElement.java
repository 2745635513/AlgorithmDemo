package com.frace.cn.leetcode.easy;

public class removeElement {
    public static int removeElement(int[] nums, int val) {
        //输出去掉数值的数组
        //算法逻辑：需要在空间O（1）
        //其中的nums是需要改变的,利用i++先赋值后加加的功能
        //如果发现有不等于比较值，就把数值从0开始替换
        int i=0;
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=val){
                nums[i++]=nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));

    }
}
