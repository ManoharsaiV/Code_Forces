package com.A;


import java.util.Scanner;

public class MultiplicationTable {


    // won't work for large values of size
    private static int countOccurrencesOf(int size, int k) {
        int[][] a = new int[size % 10][size % 10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i % 10][j % 10] = ((i + 1) % 10)  * ((j + 1) % 10);
            }
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i % 10][j % 10] == k) {
                    count++;
                }

            }
        }

        return count;

    }


    private static int occurrences(int size, int k){
        int count = 0;
        for (int i = 1; i <= size; i++) {
            if(k % i == 0 && k/i <= size){
                count++;
            }
        }

        return count;
    }








    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int size = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        System.out.println(occurrences(size, k));
        scanner.close();
    }
}
