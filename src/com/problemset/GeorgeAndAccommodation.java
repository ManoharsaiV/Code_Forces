package com.problemset;

import java.util.Scanner;

public class GeorgeAndAccommodation {

    static int numberOfRoomsAvailable = 0;

    private static void numberOfRooms(int[] a) {
        int peopleAlreadyInTheRoom = a[0], roomCapacity = a[1];
        if (roomCapacity - peopleAlreadyInTheRoom >= 2) {
            numberOfRoomsAvailable++;
        } else {
            numberOfRoomsAvailable = numberOfRoomsAvailable;
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
            numberOfRooms(a);
            stops--;
        }
        System.out.println(numberOfRoomsAvailable);

        scan.close();
    }
}
