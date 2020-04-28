package com.problemset;

import java.util.Scanner;

public class SoldierAndBanana {

	private static int borrow(int k, int n, int w) {

		int totalAmount = k * w * (w + 1) / 2;
		
		if(totalAmount < n) {
			return 0;
		}

		return totalAmount - n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		int k = Integer.parseInt(line[0]);
		int n = Integer.parseInt(line[1]);
		int w = Integer.parseInt(line[2]);
		System.out.println(borrow(k, n, w));
		scan.close();
	}

}
