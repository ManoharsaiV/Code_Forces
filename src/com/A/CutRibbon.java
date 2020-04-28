package com.A;

import java.util.Scanner;

public class CutRibbon {
    private static int maxNumberOfCuttings(int n, int a, int b, int c) {
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }


        int res = Math.max(Math.max(maxNumberOfCuttings(n - a, a, b, c), maxNumberOfCuttings(n - b, a, b, c)), maxNumberOfCuttings(n - c, a, b, c));

        if (res == -1) {
            return res;
        }

        return res + 1;

    }


    private static int maxCuts(int n, int a, int b, int c) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = -1;
            if (i - a >= 0) {
                dp[i] = Math.max(dp[i], dp[i - a]);
            }
            if (i - b >= 0) {
                dp[i] = Math.max(dp[i], dp[i - b]);
            }
            if (i - c >= 0) {
                dp[i] = Math.max(dp[i], dp[i - c]);
            }

            if (dp[i] != -1) {
                dp[i]++;
            }

        }

        return dp[n];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] in = input.split(" ");
        int length = Integer.parseInt(in[0]);
        int a = Integer.parseInt(in[1]);
        int b = Integer.parseInt(in[2]);
        int c = Integer.parseInt(in[3]);

        System.out.println(maxNumberOfCuttings(length, a, b, c));
        System.out.println(maxCuts(length, a, b, c));




    }
}
