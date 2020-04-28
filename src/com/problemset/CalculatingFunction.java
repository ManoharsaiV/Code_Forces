package com.problemset;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatingFunction {


    private static long functionN(long number) {
        if (number % 2 == 0) {
            return number / 2;
        }
        return (-1) * (number / 2 + 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(functionN(number));
        scanner.close();
    }
}
