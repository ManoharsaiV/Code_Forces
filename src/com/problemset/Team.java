package com.problemset;

import java.util.Scanner;

public class Team {

	public static int numberOfSolutions(String[] s) {
		int count = 0;
		int p1 = Integer.parseInt(s[0]);

		int p2 = Integer.parseInt(s[1]);

		int p3 = Integer.parseInt(s[2]);

		if ((p1 == 1 && p2 == 1) || (p2 == 1 && p3 == 1) || (p3 == 1 && p1 == 1) || (p1 == 1 && p2 == 1 && p3 == 1)) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int count = 0;
		while (n > 0) {
			String[] s = scan.nextLine().split(" ");
			count += numberOfSolutions(s);
			n--;
		}
		System.out.println(count);
		scan.close();

	}

}
