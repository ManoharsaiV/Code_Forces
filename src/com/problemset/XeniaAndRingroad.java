package com.problemset;


import java.util.Scanner;


public class XeniaAndRingroad {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        String[] line2 = scanner.nextLine().split(" ");
        int houses = Integer.parseInt(line[0]);
        int tasks = Integer.parseInt(line[1]);
        int[] tasksArray = new int[tasks];
        int index = 0;
        while (tasks-- > 0) {
            tasksArray[index] = Integer.parseInt(line2[index]);
            index++;
        }
        System.out.println(minTime(tasksArray, houses));

        scanner.close();


    }

    private static long minTime(int[] tasksArray, int houses) {
        long count = tasksArray[0] - 1;
        for (int i = 1; i < tasksArray.length; i++) {
            if (tasksArray[i] >= tasksArray[i - 1]) {
                count += (tasksArray[i] - tasksArray[i - 1]);
            } else {
                count += (houses - tasksArray[i - 1] + tasksArray[i]);
            }
        }

        return count;

    }


}
