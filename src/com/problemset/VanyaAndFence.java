package com.problemset;

import java.util.Scanner;

public class VanyaAndFence {

    private static int minimumRoadWidth(int[] friends, int height){
        int width = 0;
        for (int i = 0; i < friends.length; i++) {
            if(friends[i] <= height){
                width++;
            }else if(friends[i] > height){
                width += 2;
            }
        }

        return width;
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        String[] line2 = scanner.nextLine().split(" ");
        int length = Integer.parseInt(line1[0]);
        int height = Integer.parseInt(line1[1]);
        int[] friends = new int[length];
        for (int i = 0; i <friends.length ; i++) {
            friends[i] = Integer.parseInt(line2[i]);
        }
        System.out.println(minimumRoadWidth(friends,height));
        scanner.close();

    }
}
