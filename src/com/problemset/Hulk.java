package com.problemset;

import java.util.Scanner;

public class Hulk {

    private static String hulksFeelings(int number) {
        String s = "";
        String hate = "I hate";
        String love = "I love";
        int i = 1;
        while (i <= number) {
            if (i % 2 != 0) {
                s = s.concat(hate);
            } else {
                s = s.concat(love);
            }
            if (i != number) {
                s = s.concat(" that ");
            }
            i++;
        }
        s = s.concat(" it");

        return s;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(hulksFeelings(number));
        scanner.close();

    }
}
