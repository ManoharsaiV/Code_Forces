package com.A;

import java.util.Scanner;

public class DreamMoonAndStairs {


    private static int minimumNumberOfMoves(String line) {
        String[] in = line.split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        int x = 0;
        if (m > n) {
            x = -1;
        } else {
            if (n % 2 == 0) {
                x = n / 2;
            } else {
                x = n / 2 + 1;
            }
            while (x % m != 0) {
                x++;
            }
        }


        return x;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(minimumNumberOfMoves(line));
        scanner.close();

    }
}
