package com.problemset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class BeautifulYear {


    private static int findNextDistinctYear(int year) {
        Set<Character> sch = null;
        year++;
        while(year < 10000) {
            char[] years = Integer.valueOf(year).toString().toCharArray();
            sch = new HashSet<>();
            for (int i = 0; i < years.length; i++) {
                sch.add(Character.valueOf(years[i]));
            }
            if (sch.size() == years.length) {
                break;
            }else{
                year++;
                sch = null;

            }
        }


        return year;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.println(findNextDistinctYear(year));
        scan.close();
    }
}
