package com.frace.cn.hack_rank;

import java.util.Scanner;

public class TaumAndBday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long b, w, x, y, z;
        for (int i = 0; i < n; i++) {
            b = scanner.nextLong();//黑色
            w = scanner.nextLong();//白的
            x = scanner.nextLong();//黑色价钱
            y = scanner.nextLong();//白色价钱
            z = scanner.nextLong();//置换价钱
            long noChange= (long)(b*x+w*y);
            long ChangeBlack=b*(y+z)+w*y;
            long ChangeWhite=b*x+(x+z)*w;
            if (x>y){
                if (y+z>=x){
                    System.out.println(noChange);
                }else{
                    System.out.println(ChangeBlack);
                }
            }else if (x<y){
                if (x+z>=y){
                    System.out.println(noChange);
                }else{
                    System.out.println(ChangeWhite);
                }
            }else {
                System.out.println(noChange);
            }
        }

    }
}
