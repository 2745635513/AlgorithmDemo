package com.frace.cn.hack_rank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int size = arr.length;
        DecimalFormat df = new DecimalFormat("0.000000");
        if(arr.length>0 && arr.length <=100){
             for(int i = 0 ; i<arr.length;i++){
                if(arr[i]>= -100 && arr[i] <=100){
                    if(arr[i] > 0){positive++;}
                    else if(arr[i] == 0) {zero++;}
                    else{negative++;}
                }
        }
        }
        System.out.println(df.format((float)positive/size));
        System.out.println(df.format((float)negative/size));
        System.out.println(df.format((float)zero/size));
       

    }
    private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        System.out.println(arr);

        plusMinus(arr);

        scanner.close();
    }
	}


