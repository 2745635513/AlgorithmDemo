package com.frace.cn.hack_rank;

import java.util.Scanner;

public class JumpingOnCloud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String cloudArr ="";
        for (int i=0;i<n;i++){
            cloudArr+=scanner.next();
        }
        int result=0;
        int count=0;
        while (count<n-2){
            int count1=count+1;
            int count2=count+2;
            if (cloudArr.charAt(count1)=='0' && cloudArr.charAt(count2)=='0'){
                result++;
                count = count+2;
            }else if(cloudArr.charAt(count1)=='0' && cloudArr.charAt(count2)=='1'){
                result++;
                count++;
            }else if(cloudArr.charAt(count1)=='1'){
                result++;
                count = count+2;
            }
        }
        if (n==2){
            result++;
        }
        if (n>3 && cloudArr.charAt(n-3)=='1'){
            result++;
        }
        System.out.println(result);

        //网上版本
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int c[] = new int[n];
//        for(int c_i=0; c_i < n; c_i++){
//            c[c_i] = in.nextInt();
//        }
//
//        int jumps = 0;
//        int cloud = 0;
//        while (cloud != n-1) {
//            if (cloud+2 < n && c[cloud+2] != 1) {
//                cloud = cloud+2;
//            } else {
//                cloud = cloud+1;
//            }
//            jumps++;
//        }
//
//        System.out.println(jumps);
    }
}
