package com.problemset;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {

    private static int minCoins(int[] coins) {
        Arrays.sort(coins);
        int sum = 0;
        for (int i = 0; i < coins.length; i++) {
            sum += coins[i];
        }

        int eachShare = sum / 2;

        int temp = 0, count = 0;
        for (int i = coins.length - 1; i > 0; i--) {
            temp += coins[i];
            if (temp > eachShare) {
                break;
            } else {
                count++;
            }
        }


        return count + 1;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCoins = Integer.parseInt(scan.nextLine());
        String[] coinsString = scan.nextLine().split(" ");
        int index = 0;
        int[] coins = new int[numberOfCoins];
        while (index < numberOfCoins) {
            coins[index] = Integer.parseInt(coinsString[index]);
            index++;
        }
        System.out.println(minCoins(coins));
        scan.close();
    }
}
