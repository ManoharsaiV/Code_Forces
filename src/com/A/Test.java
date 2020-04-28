package com.A;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] arr = new int[length];
		arr[0] = 1;
		for (int i = 1; i < length; i++) {
			arr[i] = i + 1;
		}
		scan.close();
		System.out.println(Arrays.toString(arr));
	}

}
