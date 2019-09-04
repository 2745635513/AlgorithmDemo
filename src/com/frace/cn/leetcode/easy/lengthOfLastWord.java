package com.frace.cn.leetcode.easy;


public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        //算法逻辑：字符串为空时，返回为0
        //字符串最后是空格，返回0
        //分割，计算最后的长度
        if (s.length()==0) return 0;
        if (s.substring(s.length()-1)==" ")return 0;
        String[] str= s.split(" ");
        if (str.length==0) return 0;//为什么加上这句话才可以运行在网上
        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }
}
