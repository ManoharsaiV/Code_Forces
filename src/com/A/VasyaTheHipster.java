package com.A;


import java.util.Scanner;

public class VasyaTheHipster {
    private static int[] days(int a, int b) {
        int count = 0;
        int diffDays = Math.min(a, b);
        int sameDays = (Math.max(a, b) - diffDays) / 2;
        int[] arr = new int[2];
        arr[0] = diffDays;
        arr[1] = sameDays;
        return arr;
    }

    public static void main(String[] args) {
        String[] line = new Scanner(System.in).nextLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int[] arr = new int[2];
        arr = days(a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
