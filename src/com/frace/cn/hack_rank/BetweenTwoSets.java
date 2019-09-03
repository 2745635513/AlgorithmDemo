package com.frace.cn.hack_rank;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {
    //获得两个数的最大公约数
    public static int divisor(int a,int b){

        int temp =0;
        while (b!=0){
            temp = a%b;
            a =b;
            b =temp;
        }
        return a;
    }

    public static void main(String[] args) {
        //要求是：第一组的数据的最小公约数，第二组的最小公倍数，之间的数。。。。。。
        Scanner scanner = new Scanner( System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[] vals1 = new int[n1];
        int[] vals2 = new int[n2];
        for (int i=0;i<n1;i++){
            vals1[i]=scanner.nextInt();
        }
        Arrays.sort(vals1);
        for (int j=0;j<n2;j++){
            vals2[j] = scanner.nextInt();
        }
        Arrays.sort(vals2);
        int result =0;
        for(int l = 1 ;l<101;l++){
            int k = 0;
            for (int m =0;m<n1;m++){
                if (l % vals1[m] ==0){
                    k++;
                }
            }
            for (int n =0;n<n2;n++){
                if (vals2[n] % l ==0){
                    k++;
                }
            }
            if (k == n1+n2){
                result++;
            }
        }
        System.out.println(result);




//        System.out.println(divisor(18,24));

        //别人的代码
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int[] a = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//        int[] b = new int[m];
//        for(int b_i=0; b_i < m; b_i++){
//            b[b_i] = in.nextInt();
//        }
//
//        int c = 0;
//        for(int i = 1;i<101;i++){
//            int k = 0;
//            for(int j = 0;j<n;j++){
//                if(i % a[j] == 0){
//                    k++;
//                }
//            }
//
//            for(int j = 0;j<m;j++){
//                if(b[j] % i == 0){
//                    k++;
//                }
//            }
//
//            if(k == m+n){
//                c++;
//            }
//        }
//
//        System.out.println(c);
    }
}
