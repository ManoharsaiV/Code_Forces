package com.problemset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringTaskAnotherApproach {

	public static String taskT(String str) {
		Set<Character> hSet = new HashSet<>();
		hSet.add('a');
		hSet.add('e');
		hSet.add('i');
		hSet.add('o');
		hSet.add('u');
		hSet.add('y');
		hSet.add('A');
		hSet.add('E');
		hSet.add('I');
		hSet.add('O');
		hSet.add('U');
		hSet.add('Y');

		char[] ch = str.toCharArray();
		int countVowels = 0;
		List<Character> al = new ArrayList<>();
		
		for (char c : ch) {
			if (hSet.contains(c)) {
				countVowels++;
			} else {
				al.add(c);
				continue;
			}
		}

		int consonants = str.length() - countVowels;

		char[] nA = new char[2 * consonants];

		int index = 1;
		for (char c : al) {
			nA[index] = c;
			index += 2;
		}
		for (int i = 0; i < nA.length; i++) {
			int n = nA[i];
			if(n == 0) {
				nA[i] = '.';
			}else if(n >= 65 && n <= 90){
				nA[i] = (char) (nA[i] + 32);
			}else {
				nA[i] = nA[i];
			}
		}
		
		String nStr = "";
		for(char c : nA) {
			nStr += c;
		}

		return nStr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(taskT(str));
		scan.close();

	}

}
