package com.frace.cn.hack_rank;

public class TimeConversion {
	
	public static void main(String[] args) {
	String str = "12:45:54PM";
	String[] strs =str.split(":");
	String shiStr=strs[0];
	if(strs[2].substring(2).equals("PM")) {
		if(!strs[0].equals("00")) {
			shiStr=String.valueOf(Integer.parseInt(strs[0])+12);
		}
	}
	if(strs[0].equals("12") && strs[2].substring(2).equals("AM")) {
		shiStr ="00";
	}
	if(strs[0].equals("12") && strs[2].substring(2).equals("PM")) {
		shiStr="12";
	}
	System.out.println(shiStr+":"+strs[1]+":"+strs[2].substring(0,2));
	}
}
