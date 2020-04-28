package com.problemset;

import java.util.Scanner;

public class AntonAndDanik {

    private static int whoWins(String result){
        int count1 = 0, count2 = 0;
        for (int i = 0; i < result.length(); i++) {
            if(result.charAt(i) == 'A'){
                count1++;
            }else{
                count2++;
            }
        }

        if(count1 > count2){
            return 1;
        }else if(count2 > count1){
            return 2;
        }
        return 3;
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String result = scanner.nextLine();
        if(whoWins(result) == 1){
            System.out.println("Anton");
        }else if(whoWins(result) == 2){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
        scanner.close();
    }
}
