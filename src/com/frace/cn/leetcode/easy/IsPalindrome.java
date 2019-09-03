package com.frace.cn.leetcode.easy;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        boolean result =false;
        if (x == Integer.MIN_VALUE || x==Integer.MAX_VALUE){
            return result;
        }
        int abs =Math.abs(x);
        String str = Integer.toString(abs);
        StringBuilder sb = new StringBuilder(str);
        String resultStr = sb.reverse().toString();
        if (Integer.parseInt(resultStr) == x){
            result=true;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-2147483648));
    }
}
