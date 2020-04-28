package com.problemset;

import java.util.Arrays;
import java.util.Scanner;


public class Boredom {

    private static int maximumPointsPossible(String in){
        String[] ins = in.split(" ");
        int[] ints = new int[ins.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(ins[i]);
        }

        Arrays.sort(ints);

        for (int i = 0; i < ints.length ; i++) {

        }

        return 0;

    }







    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String in = scanner.nextLine();

    }
}
