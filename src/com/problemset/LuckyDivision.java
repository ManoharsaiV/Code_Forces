package com.problemset;

import java.util.Scanner;

public class LuckyDivision {

	public static boolean checkIfLucky(int number) {
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

	public static boolean checkIfAlmostLucky(int number) {
		if (checkIfLucky(number)) {
			return true;
		}
		boolean result = false;
		int quotient_4 = 0, quotient_7 = 0, quotient_28 = 0, quotient_47 = 0;
		if (number % 47 == 0) {
			quotient_47 = number / 47;
		} else if (number % 28 == 0) {
			quotient_28 = number / 28;
		} else if (number % 4 == 0) {
			quotient_4 = number / 4;
		} else if (number % 7 == 0) {
			quotient_7 = number / 7;
		}

		if (!(quotient_4 == 0 && quotient_7 == 0 && quotient_28 == 0 && quotient_47 == 0)
				&& (quotient_4 % 2 == 0 || quotient_7 % 2 == 0 || quotient_28 % 2 == 0 || quotient_47 % 2 == 0)) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		if (checkIfAlmostLucky(number)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scan.close();

	}

}
