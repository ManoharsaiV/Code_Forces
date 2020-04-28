package com.problemset;

import java.util.Scanner;

public class Taxi {

	public static int countTaxi(String s, int num) {
		String[] ch = s.split(" ");
		int result = 0, sum = 0;
		int[] a = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			a[i] = Integer.parseInt(ch[i]);
			sum += Integer.parseInt(ch[i]);
		}
		
		
		if ((sum & 1) == 0) {
			int p = (sum % 4 != 0) ? 1 : 0;
			result = sum / 4 + p;
		} else {
			result = (sum / 4) + 1;
		}

		return result;

	}
	

	
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		String str = scan.nextLine();
		System.out.println(countTaxi(str, num));
		scan.close();
	}

}
