package com.problemset;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BoyORGirl {
	// if the number of distinct characters in one's user name is odd, then he is a
	// male, otherwise she is a female.

	public static String determineGender(String str) {
		char[] ch = str.toCharArray();
		Set<Character> s = new TreeSet<>();
		for (char c : ch) {
			s.add(c);
		}
		String result;
		if ((s.size() & 1) == 0) {
			result = "CHAT WITH HER!";
		} else {
			result = "IGNORE HIM!";
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(determineGender(str));
		scan.close();
	}

}
