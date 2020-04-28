package com.A;

import java.util.Scanner;


public class CombinationLock {

    private static int minMoves(String o, String l) {
        char[] ol = o.toCharArray();
        char[] ll = l.toCharArray();
        int result = 0;
        for (int i = 0; i < ol.length; i++) {
            int oValue = Character.valueOf(ol[i]);
            int lValue = Character.valueOf(ll[i]);
            result += Math.min((10 - Math.abs(oValue - lValue)), Math.abs(oValue - lValue));
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String originalState = scanner.nextLine();
        String lockState = scanner.nextLine();
        System.out.println(minMoves(originalState, lockState));
        scanner.close();

    }
}
