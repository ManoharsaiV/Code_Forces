package com.problemset;

import java.util.Arrays;
import java.util.Scanner;

public class TaxiAnotherApproach {

	public static int minTaxi(String s, int len) {
		String[] c = s.split(" ");
		int[] l = new int[c.length];
		int index = 0;
		for (String st : c) {
			l[index++] = (Integer.parseInt(st));
		}
		Arrays.sort(l);
		index = 0;
		int high = l.length - 1;
		while (index < high) {
			l[index] = l[index] ^ l[high];
			l[high] = l[index] ^ l[high];
			l[index] = l[index] ^ l[high];
			index++;
			high--;
		}

        int count = 0;
		int i = 0, j = l.length - 1;
		while (i < j) {
			if (l[i] + l[j] > 4) {
				count++;
				i++;

			} else if (l[i] + l[j] == 4) {
				count++;
				i++;
				j--;
			} else {
				l[i] = l[i] + l[j];
				j--;
			}

		}
		if(i == j) {
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = Integer.parseInt(scan.nextLine());
		String str = scan.nextLine();
		System.out.println(minTaxi(str, len));
		scan.close();

	}

}
