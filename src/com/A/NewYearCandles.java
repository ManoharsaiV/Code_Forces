package com.A;


import java.util.Scanner;


public class NewYearCandles {







    private static int maxHours3(int a, int b) {
        int count = 0, rem = a % b, div = 0;
        count += a;

        while(a >= b){
            div = a / b;
            count += div;
            rem = a % b;
            a = div + rem;
        }


        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        System.out.println(maxHours3(a, b));
        scanner.close();
    }


}
