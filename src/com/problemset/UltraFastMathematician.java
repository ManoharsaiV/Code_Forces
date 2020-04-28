package com.problemset;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();
        String output = "";
        for (int i = 0; i < input1.length(); i++) {
            if(input1.charAt(i) != input2.charAt(i)){
                output += 1;
            }else{
                output += 0;
            }
        }

        System.out.println(output);
        scan.close();

    }
}

