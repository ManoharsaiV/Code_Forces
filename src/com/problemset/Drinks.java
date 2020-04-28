package com.problemset;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Drinks {
    private static double percentageOfOrangeJuice(String in) {
        String[] input = in.split(" ");
        int[] volume = new int[input.length];
        for (int i = 0; i < volume.length; i++) {
            volume[i] = Integer.parseInt(input[i]);
        }
        float x = 1;
        float volumeOfPureJuice = 0;
        float totalVolumeOfJuice = 0;
        for (int i = 0; i < volume.length; i++) {
            volumeOfPureJuice += (x * volume[i] / 100);
        }

        for (int i = 0; i < volume.length; i++) {
            totalVolumeOfJuice += x;
        }

        double result = (volumeOfPureJuice * 100/totalVolumeOfJuice);

        DecimalFormat df = new DecimalFormat("#.00000");

        df.format(result);

        return result;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String in = scanner.nextLine();
        System.out.println(percentageOfOrangeJuice(in));
        scanner.close();

    }
}
