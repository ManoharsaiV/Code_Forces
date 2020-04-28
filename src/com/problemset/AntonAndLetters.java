package com.problemset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {

    private static int countDistinct(String input) {
        Set<String> hSet = new HashSet<>();
        input = input.substring(1, input.length() - 1).trim();
        if (input.equals("")) return 0;
        String[] in = input.split(", ");
        for (String c : in) {
            hSet.add(c);
        }



        return hSet.size();

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countDistinct(input));
        scanner.close();


    }
}
