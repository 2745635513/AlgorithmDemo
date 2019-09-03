package com.frace.cn.hack_rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DesignerPdfViewer {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] vals =new int[26];
        for (int i = 0 ; i < 26;i++){
            vals[i] = in.nextInt();
        }
        String[] lowcase = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        List list = Arrays.asList(lowcase);
        int temp = 0 ;
        int max = 0 ;
        String lowcaseLetter = in.next();
        for (int j=0;j<lowcaseLetter.length();j++){
            int index = list.indexOf(lowcaseLetter.substring(j,j+1));
            temp = vals[index];
            if (temp > max){
                max = temp;
            }
        }
        System.out.println(max * lowcaseLetter.length());
    }
}
