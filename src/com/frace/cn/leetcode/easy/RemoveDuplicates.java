package com.frace.cn.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    /**
     * 移除数组中重复的数据后的长度
     * 还需要输出改变后的数组的排列
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
//        if (nums.length == 0) return 0;
//        int i = 0;
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[i]) {
//                i++;
//                nums[i] = nums[j];
//            }
//        }
        int count=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];

            }
        }
//        for (int k=0;k<count+1;k++){
//
//            System.out.println(nums[k]);
//        }
        return count + 1;
    }

    public static void main(String[] args) {
        System.out.println(RemoveDuplicates.removeDuplicates(new int[]{1,1,2})) ;
    }
}
