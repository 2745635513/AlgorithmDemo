package com.frace.cn.leetcode.easy;

/**
 * Created by frace on 2019/9/6 9:49
 */
public class climbStairs {
    /**
     * 动态规划：后一个是前两个的和，n为1和2 时时固定的，
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n<=2) return n;
        int result=0;
        int i=1,j=2,record=3;
        while (record<=n){
            result=i+j;
            i=j;
            j=result;
            record++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
}
