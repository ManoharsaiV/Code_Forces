package com.problemset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheGuy {


    private static String checkIfTheyWin(int[] x, int[] y, int gameLevelMax) {
        Set<Integer> lSet = new HashSet<>();
        for (int i : x) {
            lSet.add(i);
        }
        for (int i : y) {
            lSet.add(i);
        }


        if (lSet.size() == gameLevelMax) {
            return "I become the guy.";
        }

        return "Oh, my keyboard!";

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameLevelMax = Integer.parseInt(scanner.nextLine());
        String[] lineX = scanner.nextLine().split(" ");
        String[] lineY = scanner.nextLine().split(" ");
        int lineXlength = Integer.parseInt(lineX[0]);
        int lineYlength = Integer.parseInt(lineY[0]);
        int[] x = new int[lineXlength];
        int[] y = new int[lineYlength];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(lineX[i + 1]);
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = Integer.parseInt(lineY[i + 1]);
        }

        System.out.println(checkIfTheyWin(x, y, gameLevelMax));
        scanner.close();


    }
}
