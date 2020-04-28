package com.A;

import java.util.Scanner;

public class RemoveAProgression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		while (testCases > 0) {
			int length = scan.nextInt();
			int x = scan.nextInt();
			int[] arr = new int[length];
			arr[0] = 1;
			for (int i = 1; i < length; i++) {
				arr[i] = i + 1;
			}
			for(int j = 1; j <= arr.length; j++) {
				for (int k = 1; k <= length; k++) {
					if(j == k) {
						arr[j] = 0;
					}
				}
			}
			testCases--;
		}
		scan.close();

	}

}
