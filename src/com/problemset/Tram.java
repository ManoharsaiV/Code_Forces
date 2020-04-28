package com.problemset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tram {
    static int minTramCapacity = 0;
    static int passengersInTram = 0;

    public static void tramCapacity(int[] a) {
        int out = a[0], in = a[1];

        passengersInTram = passengersInTram + in - out;
        if (passengersInTram < minTramCapacity) {
            minTramCapacity = minTramCapacity;
        } else {
            minTramCapacity = passengersInTram;
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int stops = Integer.parseInt(scan.nextLine());

        while (stops > 0) {
            String[] totalPassangers = scan.nextLine().split(" ");
            int index = 0;
            int[] a = new int[totalPassangers.length];
            while (index < a.length) {
                a[index] = Integer.parseInt(totalPassangers[index]);
                index++;
            }
            tramCapacity(a);
            stops--;
        }
        System.out.println(minTramCapacity);

        scan.close();

    }

}
