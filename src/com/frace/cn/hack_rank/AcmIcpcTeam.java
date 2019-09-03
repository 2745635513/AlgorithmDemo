package com.frace.cn.hack_rank;

import java.util.Scanner;

public class AcmIcpcTeam {
    private int  count;

    public AcmIcpcTeam() {
        count = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] persons = new String[n];
        AcmIcpcTeam results[] = new AcmIcpcTeam[m + 1];
        for(int i=0;i<=m;i++){
            results[i]=new AcmIcpcTeam();
        }
        for (int i = 0; i < n; i++) {
            persons[i] = scanner.next();
        }
        int max = -1;
        for (int j = 0; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                int l = 0;
                for (int t = 0; t < m; t++) {
                    if (persons[j].charAt(t) == '1' || persons[k].charAt(t) == '1') {
                        l++;
                    }
                }
                results[l].count++;
                if (max < l) {
                    max = l;
                }
            }
        }
        System.out.println(max);
        System.out.println(results[max].count);
    }


}
