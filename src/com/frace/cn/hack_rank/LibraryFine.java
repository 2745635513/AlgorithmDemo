package com.frace.cn.hack_rank;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        //考虑的不够全面，想要全部概括有点问题，应该一个一个情况去考虑
        //代码还不是最精简的
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (y1 == y2){
            if (m1 == m2){
                if (d1 <= d2){
                    System.out.println(0);
                }else {
                    System.out.println(15*(d1-d2));
                }
            }else if (m1 > m2){
                System.out.println(500*(m1-m2));
            }else {
                System.out.println(0);
            }
        }else if (y1 > y2){
            System.out.println(10000);
        }else {
            System.out.println(0);
        }
    }
}
