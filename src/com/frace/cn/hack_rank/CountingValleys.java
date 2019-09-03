package com.frace.cn.hack_rank;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int length = in.nextInt();
        int valleys = 0;
        int steps = 0;

        String str = in.next(); //一次输出所有的数据，所以不能直接用str去比较需要一个一个去比较，所以用charAt（index）获取str里面的每一个字符串去比较
        for (int i = 0 ; i <length;i++){
            if (str.charAt(i)=='U' ){
                steps++;

            }else {
                if (steps == 0){
                    valleys++;
                }
                steps--;

            }
        }
        System.out.println(valleys);
    }
}
