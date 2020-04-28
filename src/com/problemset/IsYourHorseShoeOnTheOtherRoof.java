package com.problemset;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseShoeOnTheOtherRoof {


    private static int howManyHorseShoes(int[] arr) {

        Set<Integer> hashSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!hashSet.contains(arr[i])) {
                hashSet.add(arr[i]);
            } else {
                count++;
            }
        }

        return count;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split(" ");
        int[] arr = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        System.out.println(howManyHorseShoes(arr));
        scanner.close();
    }

}
