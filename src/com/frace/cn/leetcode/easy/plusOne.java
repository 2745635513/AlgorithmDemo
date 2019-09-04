package com.frace.cn.leetcode.easy;

public class plusOne {
    public static int[] plusOne(int[] digits) {
//        StringBuilder sb=new StringBuilder();
//        //组合成数字
//        for (int i=0;i<digits.length;i++){
//            sb.append(digits[i]);
//        }
//        //计算
//        String plus = String.valueOf(Integer.valueOf(sb.toString()) +1);
//
//        int[] results=new int[plus.length()];
//        String[] strings=plus.split("");
//        //拆成数组
//        for (int i=0;i<plus.length();i++){
//            results[i]=Integer.valueOf(strings[i]) ;
//
//        }
//        return results;
        //上述方法并不可行，有可能会超出int的范围
        //算法逻辑：不是9的就加1，是9 的进位加1，从最后一位开始循环
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]!=9){
                digits[i]++;
                return digits;
            }else {
                digits[i]=0;
            }
        }
        int[] result =new int[digits.length+1];
        result[0]=1;
        return result;
    }

    public static void main(String[] args) {
        plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    }
}
