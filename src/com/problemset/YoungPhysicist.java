package com.problemset;

import java.util.Scanner;

public class YoungPhysicist {
    static int sumLeft = 0, sumMiddle = 0, sumRight = 0;

    private static void checkIfInEquilibrium(int[] a) {
        sumLeft += a[0];
        sumMiddle += a[1];
        sumRight += a[2];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int[] a = new int[3];

        while (length > 0) {
			String[] line = scan.nextLine().split(" ");
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(line[i]);
            }
            checkIfInEquilibrium(a);
            length--;
        }
        if (sumRight == 0 && sumLeft == 0 && sumMiddle == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }


}


