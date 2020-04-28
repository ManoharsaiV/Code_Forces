package com.problemset;

import java.util.Scanner;

public class GameWithSticks {

    private static String whoWins(int nHorizantol, int mVertical){
        int sticks = nHorizantol + mVertical;
        int intersectionPoints = nHorizantol * mVertical;
       if(nHorizantol == 1 && mVertical == 1){
           return "Akshat";
       }
       while (nHorizantol != 1 || mVertical != 1){

       }

       return null;

    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        System.out.println(whoWins(n,m));





    }
}
