package com.problemset;


import java.util.Scanner;

/**
 * Let's describe the process more precisely. Let's say that the positions in the queue are sequentially
 * numbered by integers from 1 to n,
 * at that the person in the position number 1 is served first.
 * Then, if at time x a boy stands on the i-th position and a girl stands on the (i + 1)-th position,
 * then at time x + 1 the i-th position will have a girl and the (i + 1)-th position will have a boy.
 * The time is given in seconds.
 */


public class QueueAtTheSchool {

    private static String newQueue(String str, int sec) {

        while (sec-- > 0) {
            if (str.contains("BG")) {
                str = str.replace("BG", "GB");
            }
        }

        return str;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        String line2 = scanner.nextLine();
        int sec = Integer.parseInt(line1[1]);
        System.out.println(newQueue(line2, sec));
        scanner.close();
    }
}
