package com.problemset;

import java.util.Scanner;

public class WordCapitalization {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int v = str.charAt(0);
		char n = '\u0000';
		if (v >= 97 && v <= 122) {
			n = (char) (v - 32);
		} else {
			n = str.charAt(0);
		}
		str = str.substring(1, str.length());
		str = n + str;
		System.out.println(str);
		scan.close();

	}

}
