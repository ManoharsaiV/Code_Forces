package com.problemset;


import java.util.Arrays;
import java.util.Scanner;


public class Dubstep {


    // WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB

    // WE ARE THE CHAMPIONS MY FRIEND
    // WE ARE  THE CHAMPIONS MY FRIEND

    private static String original(String str) {
        if (str.contains("WUB")) {
            String[] strings = str.split("WUB");
            System.out.println(Arrays.toString(strings));
            for (int i = 0; i < strings.length; i++) {
                strings[i] = strings[i].trim();
                if (strings[i] != "" || strings[i] != " ") {
                    System.out.print(strings[i] + " ");
                }

            }
        }

        str = str.trim();
        return str;
    }


    static String findOriginalString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("WUB")) {
                str = str.replace("WUB", " ");
            }
        }


        String[] modified = str.split(" ");

        String original = "";

        for (int i = 0; i < modified.length; i++) {
            if (!modified[i].equals("") || !modified[i].equals(" +")) {
                modified[i] = modified[i].trim();
                original = original.concat(" ").concat(modified[i]).concat(" ");
            }
        }

        original = original.trim().replaceAll("^ +| +$|( )+", "$1");

        return original;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(findOriginalString(str));
        scanner.close();

    }
}
