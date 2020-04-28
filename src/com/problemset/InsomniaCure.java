package com.problemset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsomniaCure {

    private static int countDamagedDragons(int k, int l, int m, int n, int d) {
        if (k == 1 || l == 1 || m == 1 || n == 1) {
            return d;
        }
        int count = 0;
        List<Integer> dragonList = new ArrayList<>();
        for (int i = 1; i <= d; i++) {
            dragonList.add(i);
        }
        for (int i : dragonList) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                count++;
            }
        }

        return count;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(countDamagedDragons(k,l,m,n,d));
        scanner.close();


    }
}
