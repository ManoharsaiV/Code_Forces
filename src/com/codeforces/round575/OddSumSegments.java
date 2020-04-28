package com.codeforces.round575;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddSumSegments {
	
	public static boolean seg(BigInteger[] b, int k) {
		List<String> ls = new ArrayList<>();
		String str = b.toString();
		String sub = null;
		
		
		
		
		
		
		
		
		
		return false;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = Integer.parseInt(scan.nextLine());
		while(q > 0) {
			String[] s = scan.nextLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			BigInteger[] b = new BigInteger[n];
			String[] e = scan.nextLine().split(" ");
			for (int i = 0; i < b.length; i++) {
				b[i] = BigInteger.valueOf(Integer.parseInt(e[i]));
			}
			if(seg(b,k) == true){
				
			}else {
				System.out.println("NO");
			}
			q--;
		}
		scan.close();

	}

}
