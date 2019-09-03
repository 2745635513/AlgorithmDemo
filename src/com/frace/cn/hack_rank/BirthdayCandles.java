package com.frace.cn.hack_rank;

import java.util.Scanner;

public class BirthdayCandles {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println(in);
//	    int n = in.nextInt();
//	    
//	    int count  = 1;
//	    int temp = in.nextInt();
//	    
//	    
//	    for(int i=0; i <n-1 ; i++){
//	        int tmp = in.nextInt();
//	        if(tmp > temp){
//	            temp = tmp;
//	        }else if(tmp == temp) {
//	            count++;
//	        } 
//	    }
//	    System.out.println(count);
		int i =38;
			int yushu = i % 10;//输出为8

			int shiwei = i / 10; //输出为3

			if(yushu>5){

			shiwei +=1;

			i = shiwei * 10 ;
			System.out.println(Math.abs((2-4)));
			}
	}
}
