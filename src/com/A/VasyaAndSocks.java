package com.A;

import java.util.Scanner;

/**
 * Vasya has n pairs of socks. In the morning of each day Vasya has to put on a pair of socks before he goes to school.
 * When he comes home in the evening, Vasya takes off the used socks and throws them away.
 * Every m-th day (at days with numbers m, 2m, 3m, ...) mom buys a pair of socks to Vasya.
 * She does it late in the evening, so that Vasya cannot put on a new pair of socks before the next day.
 * How many consecutive days pass until Vasya runs out of socks?
 * Input
 * <p>
 * The single line contains two integers n and m (1 ≤ n ≤ 100; 2 ≤ m ≤ 100), separated by a space.
 * Output
 * <p>
 * Print a single integer — the answer to the problem.
 */

public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        System.out.println(countDays(n, m));
        scanner.close();
    }

    private static int countDays(int n, int m) {
        int count = 0, aux = 0;
        if (m == n) {
            return n + 1;
        } else if (m < n) {
            aux = m;
            while (n != 0) {
                n--;
                count++;
                m++;
                if (m % aux == 0) {
                    n += 1;
                }
            }
            return count;
        }


        return n;
    }


}
