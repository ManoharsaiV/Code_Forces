package com.problemset;

import java.util.Scanner;

public class Football {

	public static boolean checkIfDangerous(String str, String pat) {
		if (str.length() < pat.length()) {
			return false;
		}
		boolean result = false;
		int t = 0, p = 0, h = 1, i, j;
		int prime = 101;
		final int d = 256;
		int n = str.length();
		int m = pat.length();
		for (i = 0; i < pat.length(); i++) {
			p = ((p * d) + pat.charAt(i)) % prime;
			t = ((t * d) + str.charAt(i)) % prime;
		}
		for (i = 0; i < pat.length() - 1; i++) {
			h = (h * d) % prime;
		}
		for (i = 0; i <= n - m; i++) {
			if (p == t) {
				for (j = 0; j < pat.length(); j++) {
					if (pat.charAt(j) != str.charAt(i + j)) {
						break;
					}
				}
				if (j == pat.length()) {
					result = true;
					break;
				}
			}

			if (i < n - m) {
				t = (d * (t - str.charAt(i) * h) + str.charAt(i + m)) % prime;
				if (t < 0) {
					t += prime;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String pat = "1111111";
		if(checkIfDangerous(str, pat) == false) {
			pat = "0000000";
			System.out.println(checkIfDangerous(str, pat) ? "YES" : "NO");
		}else {
			System.out.println("YES");
		}
		scan.close();
		
	}

}
