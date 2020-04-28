package com.A;

import java.util.Scanner;

public class WrongSubtraction {

    private static int newNumber(String line){
        String[] l = line.split(" ");
        int number = Integer.parseInt(l[0]);
        int k = Integer.parseInt(l[1]);
        int index = 0, temp = 0;
        while(index < k){
            temp = number % 10;
            if(temp != 0){
                number -= 1;
            }else{
                number /= 10;
            }
            index++;
        }

        return number;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(newNumber(line));
        scanner.close();

    }
}
