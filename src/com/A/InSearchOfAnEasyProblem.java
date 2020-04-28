package com.A;

import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    private static String checkIfHard(int[] arr, int n) {
        String result = "EASY";
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                return "HARD";
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        String[] s = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(checkIfHard(arr,n));
        scanner.close();


    }
}
