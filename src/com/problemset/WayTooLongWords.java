package com.problemset;

import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		String sb = null;
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		while (t > 0) {
		
			String word = scan.next();

			if (word.length() <= 10) {
				System.out.println(word);
			} else {
				Integer s1 = new Integer((word.length()-2));
				String string = s1.toString();
				sb = word.charAt(0) + string + (word.charAt(word.length() - 1));
				System.out.println(sb.toString());
			}
			t--;
		}
		scan.close();

	}

}
