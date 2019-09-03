package com.frace.cn.leetcode.easy;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        int result=0;
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        for (int i=0;i<s.length();i++){
            String key =String.valueOf(s.charAt(i));
                int value =map.get(key);
                if (map.containsKey( key)){
                if (i ==s.length()-1 || value >= map.get(String.valueOf(s.charAt(i+1)))){
                    result +=value;
                }
                else {
                    result -=value;
                }
            }
        }
            return result;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
