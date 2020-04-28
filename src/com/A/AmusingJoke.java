package com.A;

import java.util.*;

public class AmusingJoke {
    private static String checkIf(String line1, String line2, String line3) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        List<Character> list3 = new ArrayList<>();
        List<Character> dummy = new ArrayList<>();
        char[] c1 = line1.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            list1.add(c1[i]);
        }
        c1 = line2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            list2.add(c1[i]);
        }
        c1 = line3.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            list3.add(c1[i]);
        }
        for (int i = 0; i < c1.length; i++) {
            dummy.add(c1[i]);
        }
        for (Character ch : list1) {
            if (list3.contains(ch)) {
                dummy.remove(ch);
            }
        }
        for (Character ch : list2) {
            if (dummy.contains(ch)) {
                list3.remove(ch);
            }
        }

        if(dummy.size() + list3.size() == list1.size() + list2.size()){
            return "YES";
        }

        return "NO";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        System.out.println(checkIf(line1, line2, line3));
        scanner.close();

    }
}
