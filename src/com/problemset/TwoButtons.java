package com.problemset;

import java.util.Scanner;

public class TwoButtons {


    private static int minimumNumberOfClicks(int n, int m) {
        int count = 0;
        while (n != m) {
            if (m > n) {
                if (m % 2 == 0) {
                    m /= 2;
                    count++;
                } else {
                    m++;
                    count++;
                }
            } else if (n > m) {
                m++;
                count++;
            }

        }

        return count;

    }


    private static int minClicks(int n, int m) {
        if (n == m) {
            return 0;
        }
        if (m > n) {
            if (m % 2 == 0) {
                return 1 + minClicks(n, m / 2);
            } else {
                return 1 + minClicks(n, m + 1);
            }
        }

        return 1 + minClicks(n, m + 1);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        System.out.println(minClicks(n,m));

    }
}
