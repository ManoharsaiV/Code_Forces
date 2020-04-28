package com.B;


import java.math.*;
import java.util.Scanner;


public class TPrimes {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split(" ");
        BigInteger[] array = new BigInteger[tc];
        for (int i = 0; i < line.length; i++) {
            array[i] = BigInteger.valueOf(Long.parseLong(line[i]));
        }

        for (int i = 0; i < array.length; i++) {
            if (checkIfTPrime(array[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


        scanner.close();


    }


    public static boolean checkIfTPrime(BigInteger b) {
        if (isPerfectSquare(b) && b.sqrt().isProbablePrime(1)) {
            return true;
        }

        return false;


    }

    public static boolean isPerfectSquare(BigInteger b) {
        BigInteger val = b.sqrt();

        if (val.pow(2).equals(b)) {
            return true;
        }

        return false;


    }
}
