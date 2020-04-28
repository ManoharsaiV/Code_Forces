package com.problemset;

import java.util.Scanner;

public class HQ9Plus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.contains("H") || input.contains("Q") || input.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}
