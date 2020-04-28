package com.A;

import java.util.*;

public class CaseOfTheZeroesAndOnes {

    private static int newStringLength(String in) {
        int count0 = 0, count1 = 0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
        }

        int result = count1 + count0 - 2 * Math.min(count0, count1);


        return result;


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String in = scanner.nextLine();
        System.out.println(newStringLength(in));
        scanner.close();
    }
}
