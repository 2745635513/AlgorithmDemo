package com.frace.cn.leetcode.easy;

public class addBinary {
    public static String addBinary(String a, String b) {
        /**
         * 算法逻辑：二进制求和
         * 首先需要获得最短长度，循环，当发现两个都是1时，需要记录下来在下一个求和加一
         * 进位的事件如何触发呢：
         * 不好的算法
         */
        StringBuilder sb=new StringBuilder();
//        int min = Math.min(a.length(),b.length());
//        int record=0;
//        for (int i=min-1;i>=0;i--){
//            if (a.charAt(i)+b.charAt(i)==2){
//                //需要记录进位
//                sb.append(0);
//            }else if (a.charAt(i)+b.charAt(i)==1){
//                sb.append(1);
//            }else {
//                sb.append(0);
//            }
//
//        }
        /**
         * 别人的想法很精妙
         * 参考链表的加法
         * 将a和b对应的位的数值相加，将2取余所得就是需要收集的数，被2整除是为了下一次的进位
         * 由于收集的数值是按照从后往前相加所得，所以最后结果需要逆序
         * 这里面的-'0'是因为：ASCII码中的0不是整数0，而是地48个字符，1就是第49个字符，所以相减之后就是该得的整数值
         */
        int aL=a.length()-1;
        int bL=b.length()-1;
        int carry=0;
        while (aL>=0 || bL>=0 || carry!=0){
            if (aL>=0) carry+=a.charAt(aL--)-'0';
            if (bL>=0) carry +=b.charAt(bL--)-'0';
            sb.append(carry%2);
            carry /=2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1011","11011"));
    }
}
