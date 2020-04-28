package com.problemset;


import java.util.Scanner;

public class cAPSlOCK {


    private static boolean checkIfAllExceptFirstAreUpperCase(String input) {
        char[] ch = input.toCharArray();
        int count = 0;
        if ((int) ch[0] >= 97 && (int) ch[0] <= 122) {
            for (int i = 1; i < ch.length; i++) {
                if ((int) ch[i] >= 65 && (int) ch[i] <= 90) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == input.length() - 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkIfAllAreUpperCase(String input) {
        char[] ch = input.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if ((int) ch[i] >= 65 && (int) ch[i] <= 90) {
                count++;
            } else {
                break;
            }
        }
        if (count == input.length()) {
            return true;
        }
        return false;
    }


    private static String modified(String input) {
        char[] ch = input.toCharArray();
        if (checkIfAllAreUpperCase(input)) {
            for (int i = 0; i < ch.length; i++) {
                if ((int) ch[i] >= 65 && (int) ch[i] <= 90) {
                    ch[i] = (char) (ch[i] + 32);
                } else {
                    continue;
                }
            }
        } else if (checkIfAllExceptFirstAreUpperCase(input)) {
            ch[0] = (char) (ch[0] - 32);
            for (int i = 1; i < ch.length; i++) {
                if ((int) ch[i] >= 65 && (int) ch[i] <= 90) {
                    ch[i] = (char) (ch[i] + 32);
                } else {
                    continue;
                }
            }
        }

        String s = "";
        for (char c : ch) {
            s += c;
        }
        return s;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(modified(input));
        scan.close();

    }
}
