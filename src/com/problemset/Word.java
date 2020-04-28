package com.problemset;

import java.util.Scanner;

public class Word {

    private static String changeCase(String s) {
        int i = 0, lower = 0, upper = 0;
        while (i < s.length()) {
            if ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122) {
                lower++;
            } else {
                upper++;
            }
            i++;
        }

        if (upper > lower) {
            s = s.toUpperCase();
        } else {
            s = s.toLowerCase();
        }

        return s;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(changeCase(s));
        scan.close();
    }
}
