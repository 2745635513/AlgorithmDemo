package com.frace.cn.hack_rank;

public class Kangaroo {
	static String Count() {
		int x1=21;
		int v1=6;
		int x2=47;
		int v2=3;
		String result = "YES";
        if(x1 == x2 || v1 == v2){
            result = "NO";
            return result;
        }
        if(x1 <x2 && v1 < v2){
            result ="NO";
            return result;
        }
        int n =(x2-x1)%(Math.abs(v2-v1));
        if(n != 0){
            result = "NO";
            return result;
        }
        return result;
    
	}
	public static void main(String[] args) {
		String res = Count();
		System.out.println(res);
	}

}
