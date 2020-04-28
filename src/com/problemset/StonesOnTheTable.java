package com.problemset;

import java.util.Scanner;

public class StonesOnTheTable {

	public static int costFunc(String s, int length) {
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i + 1 < length; i++) {
			if (ch[i] == ch[i + 1]) {
				count++;
			} else {
				continue;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String length = scan.nextLine();
		int l = Integer.parseInt(length);
		String str = scan.nextLine();
		System.out.println(costFunc(str, l));
		scan.close();
	}

}
