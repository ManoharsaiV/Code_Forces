package com.A;

import java.util.*;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split(" ");
        int[] arr = new int[len];
        for (int i = 0; i < line.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        System.out.println(giftedBy(arr));
        scanner.close();


    }

    private static String giftedBy(int[] arr) {
        Map<Integer, Integer> lhs = new LinkedHashMap<>();
        int val = 1;
        for (int i = 0; i < arr.length; i++) {
            lhs.put(arr[i], val);
            val += 1;
        }


        // sort the map based on key values
        ArrayList<Integer> sortedKeys = new ArrayList<>(lhs.keySet());
        Collections.sort(sortedKeys);
        String res = "";
        for (Integer key : sortedKeys) {
            res += lhs.get(key) + " ";
        }


        return res;


    }

}
