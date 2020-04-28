package com.educationalcodeforces.round69;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		String[] val = line1.split(" ");
		int[] a = new int[Integer.parseInt(val[0])];
		int k = Integer.parseInt(val[1]);
		String[] elements = line2.split(" ");
		int index = 0;
		while (index < a.length) {
			a[index] = Integer.parseInt(elements[index]);
			index++;
		}
		System.out.println(cost(a,k));
		scan.close();
	}

	public static int cost(int[] a, int k) {
		int[] temp;
		
		
		
		
		
		
		
		
		return 0;
	}

}
