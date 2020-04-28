package com.problemset;

import java.util.Scanner;

public class Translation {

    private static boolean checkIfValidTranslation(String s, String t) {
        StringBuilder sb = new StringBuilder();
        if (s.equalsIgnoreCase(sb.append(t).reverse().toString())) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        if (checkIfValidTranslation(s, t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}
