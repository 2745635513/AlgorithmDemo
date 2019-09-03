package com.frace.cn.hack_rank;

import java.util.Arrays;
import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int sLength = s.length();
        String[] strs = s.split("");
        String t = scanner.next();
        int tLength = t.length();
        String[] ts = t.split("");
        int k = scanner.nextInt();

        String[] moves = new String[100];
        int minLength =0;
        if (sLength > t.length()) {
            minLength = tLength;
        } else {
            minLength = sLength;
        }
        int count =0;
        for (int i =0 ;i<minLength;i++){
                if (strs[i].equals(ts[i])){
                    count++;
                }else {
                    break;
                }
            }


        if (s.equals(t)){
                if (k%2==0 || k>sLength*2){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
        }else if (sLength != count){

            if (k >= (s.length() + t.length() - (count * 2))){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }else {
            for (int j =1;j<=count;j++){
                moves[j-1] = j + (tLength-count+j)+"";

            }
            if ( useList(moves,String.valueOf(k)) || k >= Integer.parseInt(moves[count-1]) ){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
    public static boolean useList(String[] arr,String targetValue){
        return Arrays.asList(arr).contains(targetValue);
    }
}
