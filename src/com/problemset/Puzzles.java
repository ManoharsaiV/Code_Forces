package com.problemset;


import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line1 = scan.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        String[] line2 = scan.nextLine().split(" ");
        int[] puzzlePieces = new int[m];
        for (int i = 0; i < m; i++) {
            puzzlePieces[i] = Integer.parseInt(line2[i]);
        }
        System.out.println(leastDifference(puzzlePieces, n));
        scan.close();


    }


    public static int leastDifference(int[] arr, int n) {
        if (arr.length < n) {
            return -1;
        }
        if (arr.length == n) {
            Arrays.sort(arr);
            return arr[arr.length - 1] - arr[0];
        }


        Arrays.sort(arr);

        int i = 0, j = i + n - 1;
        int diff = Integer.MAX_VALUE;
        while (i <= arr.length - n && j <= arr.length - 1) {
            if (arr[j] - arr[i] < diff) {
                diff = arr[j] - arr[i];
            }
            i++;
            j = i + n - 1;
        }

        return diff;


    }
}
