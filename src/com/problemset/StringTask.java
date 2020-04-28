package com.problemset;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask {
	
	public static int[] vowelsCountAndConsonantCount(String str) {
		char[] ch = str.toCharArray();
		int count1 = 0, count2 = 0;
		for(int i = 0; i < ch.length; i++) {
			if(	ch[i] == 'a' ||
				ch[i] == 'A' ||
				ch[i] == 'e' ||
				ch[i] == 'E' ||
				ch[i] == 'i' ||
				ch[i] == 'I' ||
				ch[i] == 'o' ||
				ch[i] == 'O' ||
				ch[i] == 'y' ||
				ch[i] == 'Y' ||
				ch[i] == 'u' ||
				ch[i] == 'U'){
				count1++;	
			}
			else {
				count2++;
			}
		}
		int[] a = new int[2];
		a[0] = count1;
		a[1] = count2;
		
		return a;
	}
	
	public static String task(String str) {
		int[] counts = vowelsCountAndConsonantCount(str);
		int consonantCount = counts[1];
		char[] newChar = new char[(2 * consonantCount)];
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(		ch[i] == 'a' ||
					ch[i] == 'A' ||
					ch[i] == 'e' ||
					ch[i] == 'E' ||
					ch[i] == 'i' ||
					ch[i] == 'I' ||
					ch[i] == 'o' ||
					ch[i] == 'O' ||
					ch[i] == 'y' ||
					ch[i] == 'Y' ||
					ch[i] == 'u' ||
					ch[i] == 'U') {
				continue;
			}else {
				newChar[i] = '.';
			}
		}
		
		
		for (int i = 0; i < ch.length; i++) {
			if(newChar[i] == '.') {
				if(!(ch[i] == 'a' ||
					ch[i] == 'A' ||
					ch[i] == 'e' ||
					ch[i] == 'E' ||
					ch[i] == 'i' ||
					ch[i] == 'I' ||
					ch[i] == 'o' ||
					ch[i] == 'O' ||
					ch[i] == 'y' ||
					ch[i] == 'Y' ||
					ch[i] == 'u' ||
					ch[i] == 'U')) {
					newChar[i + 1] = ch[i];
				}
			}
		}
		
		
		
		
	
		System.out.println(Arrays.toString(newChar));
		String newString = " ";
		for(char c : newChar) {
			newString += c;
		}
		
		return newString;
		
	}
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		//String sample = "Codeforces";
		System.out.println(task(str));
		scan.close();

	}

}
