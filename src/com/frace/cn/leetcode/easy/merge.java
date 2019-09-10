package com.frace.cn.leetcode.easy;

/**
 * Created by frace on 2019/9/6 11:18
 */
public class merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         * 算法逻辑：从后往前比较，大的放在num1的后面
         */
        int p= n-- + m-- -1;
        while (n>=0 && m>=0){
            nums1[p--]=nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n>=0){
            nums1[p--]=nums2[n--];
        }
        for (int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,0,0,0,0},2,new int[]{2,3,5,6},4);
    }
}
