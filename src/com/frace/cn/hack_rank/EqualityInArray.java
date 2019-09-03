package com.frace.cn.hack_rank;

import java.util.*;

public class EqualityInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[]  arrs = new int[101];
        for (int i=0;i<n;i++){
            arrs[scanner.nextInt()]+=1;
        }

        System.out.println(n-Arrays.stream(arrs).max().getAsInt());
    }
}
