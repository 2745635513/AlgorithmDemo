package com.frace.cn.hack_rank;

import java.util.Scanner;

public class TeacherAngry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int j = 0; j < num; j++) {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int count = 0 ;
            for (int i = 0 ; i<n1 ;i++){
                if (in.nextInt() <= 0) {
                    count++;
                }
            }
            if (count >= n2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
