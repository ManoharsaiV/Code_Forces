package com.problemset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KefaAndFirstSteps {




    private static int  longestSubSequenceLength(int[] profits){
        if (profits.length == 1) {
            return 1;
        }
        int cost = 0, temp = 0;
        int i = 0, j = 1;
        while (i < j && j < profits.length) {
            if (profits[i] <= profits[j]) {
                cost++;
                i++;
                j++;
            } else {
                cost = 0;
                i++;
                j++;
            }
           if(cost > temp){
               temp = cost;
           }else{
               temp = temp;
           }

        }



        return temp + 1;
    }



    private static int longestSubSequenceInProfits(int[] profits) {
        if (profits.length == 1) {
            return 1;
        }
        List<Integer> costL = new ArrayList<>();
        int cost = 0;
        int i = 0, j = 1;
        while (i < j && j < profits.length) {

            if (profits[i] <= profits[j]) {
                cost++;
                i++;
                j++;
            } else {
                cost = 0;
                i++;
                j++;
            }
            costL.add(cost);

        }

        Collections.sort(costL);


        return costL.get(costL.size() - 1) + 1;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        String[] a = scan.nextLine().split(" ");
        int[] profits = new int[length];
        for (int i = 0; i < a.length; i++) {
            profits[i] = Integer.parseInt(a[i]);
        }
        System.out.println(longestSubSequenceInProfits(profits));
        scan.close();

    }
}
