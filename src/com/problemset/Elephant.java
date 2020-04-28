package com.problemset;

import java.util.Scanner;

public class Elephant {
    private static int minimumNumberOfSteps(int number) {
        int count = 0;
        while (number != 0) {
            if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5) {
                count++;
                break;
            } else {
                number -= 5;
                count++;
            }
        }
        return count;
    }


    private static int minNumber(int number) {
        if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5) {
            return 1;
        }
        return 1 + minNumber(number - 5);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(minimumNumberOfSteps(number));
        System.out.println(minNumber(number));
        scan.close();
    }
}
