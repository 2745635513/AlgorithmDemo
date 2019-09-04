package com.frace.cn.leetcode.easy;

public class countAndSay {
    public static String countAndSay(int n) {
        /**
         * 别人的思路:
         * 把n之前的每一行都输出
         * 输出的过程：计数转换
         */
        if (n<=0) return "";
        String[] seq=new String[n];
        seq[0]="1";
        for (int i=1;i<n;i++){
            seq[i]=  seq[i-1];
        }
        return seq[n-1];
    }

    public String convert(String records){
        StringBuilder sb = new StringBuilder();
        int count =1;
        for (int i=0;i<records.length();i++){
            if (i !=records.length()-1 && records.charAt(i)==records.charAt(i+1)){
                count++;
            }else {
                sb.append(count).append(records.charAt(i));
                count=1;
            }
        }
        return sb.toString();
    }
}
