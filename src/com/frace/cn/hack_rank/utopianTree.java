package com.frace.cn.hack_rank;

import java.util.Scanner;

public class utopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int height = 1;
            int next = in.nextInt();
            if (next == 0) {
                System.out.println(height);
            } else {
                for (int j = 1; j <= next; j++){
                    if (j % 2 != 0) {
                        height = height * 2;
                    } else {
                        height++;
                    }
                }
                System.out.println(height);
            }
        }
    }
}
