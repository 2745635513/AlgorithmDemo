package com.frace.cn.hack_rank;

import java.util.Scanner;

public class DayOfProgranmmer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int feb = 28;
		if (year < 1919) {
			if (year % 4 == 0) {
				feb = 29;
			}
		}
		else {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				feb = 29; //闰年
			}
		}
		int count = 41 - feb;

		System.out.println(count);
	}

}
