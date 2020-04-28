package com.problemset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrationSystem {


    static List<String> sList = new ArrayList<>();
    static int addUp = 0;


    private static boolean checkIfNumber(String in) {
        int index = in.length() - 1;
        if (in.charAt(index) != 'a' || in.charAt(index) != 'b' || in.charAt(index) != 'c' || in.charAt(index) != 'd' || in.charAt(index) != 'e' ||
                in.charAt(index) != 'f' || in.charAt(index) != 'g' || in.charAt(index) != 'h' || in.charAt(index) != 'i' || in.charAt(index) != 'j' ||
                in.charAt(index) != 'k' || in.charAt(index) != 'l' || in.charAt(index) != 'm' || in.charAt(index) != 'n' || in.charAt(index) != 'o' ||
                in.charAt(index) != 'p' || in.charAt(index) != 'q' || in.charAt(index) != 'r' || in.charAt(index) != 's' || in.charAt(index) != 't' ||
                in.charAt(index) != 'u' || in.charAt(index) != 'v' || in.charAt(index) != 'w' || in.charAt(index) != 'x' || in.charAt(index) != 'y' ||
                in.charAt(index) != 'z') {
            return false;
        }


        return true;

    }


    private static String newUserName(String in) {
        String modified = "";
        if (checkIfNumber(in)) {
            int numericVal = (int) in.charAt(in.length() - 1);
            addUp = numericVal + 1;
            modified = modified.concat(in) + addUp;
        } else {
            addUp = 1;
            modified = modified.concat(in) + addUp;
        }


        return modified;


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (i < length) {
            String in = scanner.nextLine();
            if (!sList.contains(in)) {
                sList.add(in);
                System.out.println("OK");
            } else {
                String newStr = newUserName(in);
                if (sList.contains(newStr)) {
                    newStr = newUserName(newStr);
                    sList.add(newStr);
                } else {
                    sList.add(newStr);
                    sList.add(newStr);
                    System.out.println(newStr);
                }

            }
            i++;
        }

        scanner.close();

    }
}
