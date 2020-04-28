package com.problemset;


import java.util.*;

public class Pangram {

    private static boolean checkIfPangram(String s) {
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        int counts = 0;
        for (int i = 65; i < 91; i++) {
            if (count[i] != 0) {
                counts++;
            }
        }

        for (int i = 97; i < 123; i++) {
            if (count[i] != 0 && count[i - 32] == 0) {
                counts++;
            }
        }


        if (counts >= 26) {
            return true;
        }

        return false;


    }







    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        if (checkIfPangram(input))
            System.out.println("YES");
        else
            System.out.println("NO");
        scanner.close();


    }
}
