package com.A;


import java.util.Scanner;

public class NewYearTransportation {

    private static boolean checkIfICanReachCity(String line1, String line2) {
        String[] l1 = line1.split(" ");
        int n = Integer.parseInt(l1[0]);
        int t = Integer.parseInt(l1[1]);
        int[] a = new int[n];
        String[] l2 = line2.split(" ");
        a[a.length-1] = 0;
        for (int i = 0; i < l2.length; i++) {
            a[i] = Integer.parseInt(l2[i]);
        }

        for (int i = 0; i < a.length; ) {
            i += a[i];
            if (i == t-1) {
                return true;
            } else if(i > t-1){
                break;
            }else{
                continue;
            }
        }

        return false;


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        if (checkIfICanReachCity(line1, line2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();

    }
}
