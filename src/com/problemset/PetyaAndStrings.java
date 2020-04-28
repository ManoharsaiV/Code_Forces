package com.problemset;

import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		if(s1.compareToIgnoreCase(s2) < 0) {
			System.out.println(-1);
		}else if(s1.compareToIgnoreCase(s2) > 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		scan.close();

	}

}
