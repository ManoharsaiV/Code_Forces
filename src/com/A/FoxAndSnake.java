package com.A;

import java.util.Scanner;

public class FoxAndSnake {
    private static void drawASnake(String input){
        String[] in = input.split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        String[][] snake = new String[n][m];
        for (int i = 0; i < snake.length; i++) {
            for (int j = 0; j < snake[i].length; j++) {
                if(i % 2 != 0){
                    snake[i][j] = "#";
                }
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        scanner.close();
    }
}
