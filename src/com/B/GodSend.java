package com.B;

import java.util.Scanner;

public class GodSend {
    private static String whoWins(String line1, String line2) {
        int length = Integer.parseInt(line1);
        String[] l2 = line2.split(" ");
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(l2[i]);
        }
        int even = 0, odd  = 0, i = 0;
        for (i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        if(even == a.length){
            return "Second";
        }


        return "First";

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        System.out.println(whoWins(line1, line2));
        scanner.close();
    }
}
