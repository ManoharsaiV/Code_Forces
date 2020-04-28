package com.A;

import java.util.*;
import java.util.stream.Collectors;


public class Dragons {

    // strengths of dragons can be duplicates

    /**
     * .sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed())
     *                 .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
     * */
    

    private static boolean checkIfSheCanDefeat(Map<Integer, Integer> tMap, int s) {
        //System.out.println(tMap);

        tMap = tMap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

       // System.out.println(tMap);

        for (Map.Entry<Integer, Integer> entry : tMap.entrySet()) {
            int strengthOfDragon = entry.getKey();
            if (s > strengthOfDragon) {
                s += entry.getValue();
            } else {
                return false;
            }

        }

        return true;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String[] l1 = line1.split(" ");
        int kiritostrength = Integer.parseInt(l1[0]);
        int numberOfLevels = Integer.parseInt(l1[1]);
        Map<Integer, Integer> treeMap = new TreeMap<>();
        while (numberOfLevels-- > 0) {
            String[] line2 = scanner.nextLine().split(" ");
            treeMap.put(Integer.parseInt(line2[0]), Integer.parseInt(line2[1]));
        }

        if (checkIfSheCanDefeat(treeMap, kiritostrength)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();


    }
}
