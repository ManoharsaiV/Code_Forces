package com.A;

import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = Integer.parseInt(scanner.nextLine());
        while (tc-- > 0) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            System.out.println(calculateMinMoves(a, b));
        }
    }

//    static int calculateMinDistance(int a, int b) {
//        if (a % b == 0) {
//            return 0;
//        }
//
////        return 1 + calculateMinDistance(a + 1, b);
//
//        int count = 0;
//
//        for (int i = a; i % b != 0; i++) {
//            count++;
//        }
//
//        return count;
//
//    }

    static int calculateMinMoves(int a, int b) {

        if (a % b == 0) {
            return 0;
        }


        int moves = 0;
        if (a < b) {
            int diff = b - a;
            moves = diff;
            return moves;
        }

        int rem = a % b;
        moves = b - rem;

        return moves;
    }


}
