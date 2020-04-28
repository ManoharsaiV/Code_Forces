package com.problemset;

import java.util.Scanner;


public class NextRound {


    public static int nextRound(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] >= arr[k]) {
                count++;
            }
        }

        return count;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputLine1 = scan.nextLine().split(" ");
        int n = Integer.parseInt(inputLine1[0]);
        int k = Integer.parseInt(inputLine1[1]);
        String[] inputLine2 = scan.nextLine().split(" ");
        int[] arr = new int[n];
        int index = 0;
        for (String s : inputLine2) {
            arr[index++] = Integer.parseInt(s);

        }
        System.out.println(nextRound(arr, k - 1));
        scan.close();

    }

}
//17 14
//
//16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0