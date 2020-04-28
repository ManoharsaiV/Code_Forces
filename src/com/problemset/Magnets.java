package com.problemset;

import java.util.Scanner;

public class Magnets {

    private static int numberOfGroupsOfMagnets(int[] a) {
        int temp = 0, count = 0;
        for (int i = 0; i + 1 < a.length; i++) {
            temp = a[i];
            if (temp != a[i + 1]) {
                count++;
            } else if (temp == a[i + 1]) {
                continue;
            }

        }


        return count+1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int index = 0;
        int[] a = new int[length];
        while(index < length){
            a[index++] = scanner.nextInt();
        }
        System.out.println(numberOfGroupsOfMagnets(a));
        scanner.close();

    }
}
