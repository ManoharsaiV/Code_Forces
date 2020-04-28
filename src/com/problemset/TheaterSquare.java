package com.problemset;

import java.util.Scanner;

public class TheaterSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] values = scan.nextLine().split(" ");
		long n = Integer.parseInt(values[0]);
		long m = Integer.parseInt(values[1]);
		long a = Integer.parseInt(values[2]);
		long min = (long) (Math.ceil(n / (double)a) * 
        Math.ceil(m / (double)a)); 

		System.out.println(min);
		scan.close();
	}

}
