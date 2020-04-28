package com.problemset;


import java.util.Scanner;

public class NearlyLuckyNumber {


    private static boolean checkIfLucky(int number) {
        boolean result = false;
        int numOfDigits = 0;
        String num = Integer.valueOf(number).toString();
        char[] ch = num.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '4' || ch[i] == '7') {
                numOfDigits++;
            } else {
                break;
            }
        }

        if (numOfDigits == ch.length) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }





    private static boolean checkIfNearlyLucky(String b){
        int count = 0;
        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == '4' || b.charAt(i) == '7'){
                count++;
            }else{
                continue;
            }
        }

        if(checkIfLucky(count)){
            return true;
        }

        return false;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String b = scan.nextLine();
        if(checkIfNearlyLucky(b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        scan.close();
    }
}
