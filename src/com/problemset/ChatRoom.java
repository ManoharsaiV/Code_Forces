package com.problemset;

import java.util.Scanner;

public class ChatRoom {

	public static boolean check(String s) {
		char[] c = s.toLowerCase().toCharArray();
		char[] check = "hello".toCharArray();
		int count = 0;
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if ((int) c[i] == (int) check[j]) {
				j++;
				count++;
				if (count == 5) {
					break;
				}
			}
		}
		if (count == 5) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (check(s) == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scan.close();
	}

}