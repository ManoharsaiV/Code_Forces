package com.problemset;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] b = scanner.nextLine().split(" ");
        int[] blocks = new int[length];
        for (int i = 0; i <blocks.length ; i++) {
            blocks[i] = Integer.parseInt(b[i]);
        }
        Arrays.sort(blocks);
        String s = "";
        for(int i : blocks){
            s += i + " ";
        }
        System.out.println(s);
        scanner.close();

    }
}
