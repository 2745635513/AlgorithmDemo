package com.frace.cn.leetcode.easy;

import java.awt.dnd.DropTarget;
import java.util.Date;


public class mySqrt {
    public static float mySqrt(int x) {
        //普通方法，超时
//            if(0 == x) return 0;
//            int num = 1;
//            while(num <= x/num){
//                num++;
//            }
//            if(num*num == x)
//                return num;

//            else
//                return num-1;
//        float r = x;
//        while (r*r > x)
//            r = (r + x/r) / 2;//牛顿迭代法
//        return (int) r;//为什么会超时
        double begin = 0;
        double end = x;
        double result = 1;
        double mid = 1;
        while(Math.abs(result-x) > 0.000001){
            mid = (begin+end)/2;
            result = mid*mid;
            if(result > x)
                end = mid;
            else begin = mid;
        }

        return (int)mid;
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(mySqrt(2147395599));
        System.out.println(System.currentTimeMillis());
    }
}
