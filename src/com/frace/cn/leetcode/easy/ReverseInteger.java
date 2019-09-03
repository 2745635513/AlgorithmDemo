package com.frace.cn.leetcode.easy;

public class ReverseInteger {

    public static int reverse(int x) {
        if(x==Integer.MIN_VALUE){
            return x;
        }
        int abs =Math.abs(x);
        String str = Integer.toString(abs);
        StringBuilder sb = new StringBuilder(str);
        String result = sb.reverse().toString();
        if(Long.parseLong(result)>Integer.MAX_VALUE ){
            return 0;
        }else {
           return x>0?Integer.parseInt(result) : -Integer.parseInt(result);
        }
    }
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
}
