package com.frace.cn.hack_rank;

import java.util.Scanner;

public class FindDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++ ){
            String value=scanner.nextInt()+"";
            int val = Integer.parseInt(value);
            int length = value.length();
            int nums =0;
            String[] strs = value.split("");
            for(int j=0;j<strs.length;j++){

                if(Integer.parseInt(strs[j]) != 0 && val % Integer.parseInt(strs[j])  ==0  ){
                    nums++;
                }
            }
            System.out.println(nums);
        }

    }
}
