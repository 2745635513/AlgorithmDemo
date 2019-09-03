package com.frace.cn.hack_rank;

import java.util.ArrayList;
import java.util.List;

public class BreakingWorstBest {
public static void main(String[] args) {
	int[] scores = {10,5,20,20,4,5,2,25,1};
	int n = scores.length;
    List<Integer> HighList = new ArrayList<>();
    List<Integer> LowList = new ArrayList<>();
    int k =0;
    int m =0;
    HighList.add(scores[0]);
    LowList.add(scores[0]);
    for(int i = 1 ;i<n;i++){
        if(scores[i]> HighList.get(m)){
            m++;
            HighList.add(scores[i]);
        }
        else if(scores[i] < LowList.get(k)){
            k++;
            LowList.add(scores[i]);
        }
    }
    int[] result = new int[2];
    result[0] = HighList.size();
    result[1] = LowList.size();
    System.out.println(result[0]+","+result[1]);
}
}
