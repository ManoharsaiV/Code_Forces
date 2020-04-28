package com.codeforces.round575;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ThreePilesOfCandies {

	public static BigInteger maxCandies(BigInteger[] a) {
		Arrays.sort(a);
		BigInteger A = a[0];
		BigInteger B = a[1];
		BigInteger C = a[2];
		BigInteger X = B.subtract(A);
		C = C.subtract(X);
		BigInteger Y = C.divide(BigInteger.valueOf(2));
		A = A.add(X).add(Y);

		return A;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		BigInteger[] a = new BigInteger[3];
		while (t > 0) {
			String[] s = scan.nextLine().split(" ");
			for (int i = 0; i < a.length; i++) {
				a[i] = new BigInteger(s[i]);
			}
			System.out.println(maxCandies(a));
			t--;
		}
		scan.close();

	}

}
