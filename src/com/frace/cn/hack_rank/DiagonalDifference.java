package com.frace.cn.hack_rank;

import java.io.IOException;

public class DiagonalDifference {
    static int diagonalDifference(int[][] arr) {
         int result =0;
         int result1=0;
         for(int i =0;i<arr.length;i++){
             for(int j =0;j<arr.length;j++){
                    if(i==j){
                        result +=arr[i][j];
                    }
                    if(i+j==arr.length-1){
                        result1+=arr[i][j];
                    }
             }
             
         }
         result = Math.abs(result - result1);
         return result;

    }


    public static void main(String[] args) throws IOException {
    		int[][] arr = new int[3][3];
    		arr[0][0]=11;
    		arr[0][1]=2;
    		arr[0][2]=4;
    		arr[1][0]=4;
    		arr[1][1]=5;
    		arr[1][2]=6;
    		arr[2][0]=10;
    		arr[2][1]=8;
    		arr[2][2]=-12;
    		

        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}
