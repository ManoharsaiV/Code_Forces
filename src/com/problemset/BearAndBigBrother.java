package com.problemset;

import java.util.Scanner;

public class BearAndBigBrother {

    private static int howManyYears(int limakWeight, int bobWeight) {
        int count = 0;
        if (limakWeight == bobWeight) {
            return 1;
        }else if(limakWeight > bobWeight){
            return 0;
        }
        while (limakWeight <= bobWeight) {
            limakWeight *= 3;
            bobWeight *= 2;
            count++;
        }

        return count;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int limakWeight = Integer.parseInt(line[0]);
        int bobWeight = Integer.parseInt(line[1]);
        System.out.println(howManyYears(limakWeight, bobWeight));
        scanner.close();


    }
}
