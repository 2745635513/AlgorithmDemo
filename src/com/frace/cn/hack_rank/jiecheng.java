package com.frace.cn.hack_rank;

import java.math.BigDecimal;
import java.util.Scanner;

public class jiecheng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float result =1;
        for (int i =2;i<=n;i++){
            result *=i;
        }
        BigDecimal bd = new BigDecimal(result);
        System.out.println(bd.toPlainString());
    }
}
