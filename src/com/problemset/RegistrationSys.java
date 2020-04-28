package com.problemset;

import java.util.*;

public class RegistrationSys {
    static int i = 1;
    static Map<String, Integer> hs = new HashMap<>();


    private static String modifiedString(String in) {
        if (!hs.containsKey(in)) {
            hs.put(in, 1);
            return "OK";
        } else {
            int f = hs.get(in);
            hs.put(in, f + 1);
            in = in.concat(String.valueOf(f));
            hs.put(in, 1);
            return in;
        }


    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (i++ < length) {
            String in = scanner.nextLine();
            System.out.println(modifiedString(in));
        }
        scanner.close();
    }
}

