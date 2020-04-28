package com.problemset;

import java.util.Scanner;

public class BitPlusPlus {

	public static float val(String str) {
		String[] s = str.split("");
		int[] a = new int[3];
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("X")) {
				a[i] = 0;
			} else if (s[i].equals("+")) {
				a[i] = 1;
			} else {
				a[i] = -1;
			}
		}
	
		float result = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 1) {
				result += 0.5;
			}else if(a[i] == -1){
				result += -0.5;
			}else {
				result += 0;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		int finalVal = 0;
		while (t > 0) {
			String str = scan.nextLine();
			finalVal += val(str);
			t--;
		}
		System.out.println(finalVal);

		scan.close();

	}

}
