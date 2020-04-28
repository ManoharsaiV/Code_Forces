package com.A;

import java.util.Scanner;

public class ErasingZeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = Integer.parseInt(scanner.nextLine());
        while (tc-- > 0) {
            String input = scanner.nextLine();
            System.out.println(findMinZeros(input));
        }
        scanner.close();

    }

    public static int findMinZeros(String s) {
        String ss = "";
        int startIndex = -1, endIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                startIndex = i;
                break;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                endIndex = i;
                break;
            }
        }

        if (startIndex == endIndex) {
            return 0;
        }

        if (startIndex == -1 && endIndex == -1) {
            return 0;
        }


        ss = s.substring(startIndex, endIndex);
        int count = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == '0') {
                count++;
            }
        }

        return count;

    }

}
