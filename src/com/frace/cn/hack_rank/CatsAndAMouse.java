package com.frace.cn.hack_rank;

import java.util.Scanner;

public class CatsAndAMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0;i < n;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            if (Math.abs(x-z) > Math.abs(y-z)){
                System.out.println("Cat B");
            }else if(Math.abs(x-z) < Math.abs(y-z)){
                System.out.println("Cat A");
            }else{
                System.out.println("Mouse C");
            }
        }
    }
}
