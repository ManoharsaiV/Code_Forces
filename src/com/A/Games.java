package com.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teams = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> alHome = new ArrayList<>();
        ArrayList<Integer> alGuest = new ArrayList<>();
        while (teams-- > 0) {
            String[] line = scanner.nextLine().split(" ");
            alHome.add(Integer.parseInt(line[0]));
            alGuest.add(Integer.parseInt(line[1]));
        }

        System.out.println(countOccassions(alHome, alGuest));
        scanner.close();


    }

    private static int countOccassions(ArrayList<Integer> alHome, ArrayList<Integer> alGuest) {
        Map<Integer, Integer> guestMap = new HashMap<>();
        for (Integer I : alGuest) {
            if (!guestMap.containsKey(I)) {
                guestMap.put(I, 1);
            } else {
                guestMap.put(I, guestMap.get(I) + 1);
            }
        }

        int count = 0;
        for (Integer I : alHome) {
            if (guestMap.containsKey(I)) {
                count += guestMap.get(I);
            }
        }

        return count;

    }
}
