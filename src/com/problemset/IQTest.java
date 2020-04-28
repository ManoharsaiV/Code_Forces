package com.problemset;

import java.util.Scanner;

public class IQTest {


    private static boolean checkIfEven(int number) {
        if ((number & 1) == 0) {
            return false;
        }
        return true;
    }


    private static int returnWeirdIndex(int[] numbers) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (checkIfEven(numbers[i])) {
                count1++;
            } else {
                count2++;
            }
        }
        int j = 0;
        if (count1 == numbers.length - 1) {
            for (; j < numbers.length; j++) {
                if (checkIfEven(numbers[j])) {
                    continue;
                } else {
                    break;
                }
            }
        } else {
            for (; j < numbers.length; j++) {
                if (!checkIfEven(numbers[j])) {
                    continue;
                } else {
                    break;
                }
            }

        }


        return j + 1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split(" ");
        int[] numbers = new int[length];
        int index = 0;
        while (index < length) {
            numbers[index] = Integer.parseInt(line[index]);
            index++;
        }
        System.out.println(returnWeirdIndex(numbers));
        scanner.close();


    }
}
