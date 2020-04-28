package com.problemset;

import java.util.Scanner;

public class Expression {

    private static int maxValue(int a, int b, int c) {
        int val_1 = (a + b) * c;
        int val_2 = a * b + c;
        int val_3 = a * (b + c);
        int val_4 = a * b * c;
        int val_5 = a + b * c;
        int val_6 = a + b + c;

        val_1 = Math.max(val_1, val_2);
        val_3 = Math.max(val_3, val_4);
        val_4 = Math.max(val_4, val_5);
        val_4 = Math.max(val_4, val_6);

        val_1 = Math.max(val_1, val_3);
        val_4 = Math.max(val_1, val_4);


        return Math.max(val_1, val_4);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(maxValue(a, b, c));
        scan.close();
    }
}
