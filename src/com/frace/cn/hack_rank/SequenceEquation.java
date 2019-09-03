package com.frace.cn.hack_rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer> values = new ArrayList<>();
        values.add(0);
        for (int i=1;i<=n;i++){
            values.add(i,scanner.nextInt());
        }
        for (int j=1;j<=n;j++){
            int index1 = values.indexOf(j);
            int index2 =values.indexOf(index1);
            System.out.println(index2);
        }


    }
}
