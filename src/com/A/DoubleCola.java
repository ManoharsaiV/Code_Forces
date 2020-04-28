package com.A;

import java.util.Scanner;

public class DoubleCola {
    private static int whoDrinks(int number) {
        for (int i = 1; i <= number; i++) {

        }

        return 0;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int result = whoDrinks(number);
        if (result == 1) {
            System.out.println("Sheldon");
        } else if (result == 2) {
            System.out.println("Leonard");
        } else if (result == 3) {
            System.out.println("Penny");
        } else if (result == 4) {
            System.out.println("Rajesh");
        } else {
            System.out.println("Howard");
        }
        scanner.close();
    }
}
