package com.problemset;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] sa = str.split("\\+");
		int[] a = new int[sa.length];
		int index = 0;
		for(String s : sa) {
			a[index] = Integer.parseInt(s);
			index++;
		}
		Arrays.sort(a);
		String ns = "";
		for(int i : a) {
			ns += i+"+";
		}
		System.out.println(ns.substring(0, ns.length()-1));
		scan.close();

	}

}
