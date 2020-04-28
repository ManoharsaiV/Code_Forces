package com.B;



/** The first line contains two integers N and K (0 ≤ N ≤ 1018, 1 ≤ K ≤ 105) — the number of hamsters that will grow up on Dima's farm and the number of types of boxes that the factory produces.
 999_999_999_999_993_789
 The second line contains K integers a1, a2, ..., aK (1 ≤ ai ≤ 1018 for all i) — the capacities of boxes.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class HamsterFarm {
    private static long[] typeAndNumberOfBoxes(String line1, String line2) {
        String[] l1 = line1.split(" ");
        long hamsters = Long.parseLong(l1[0]);
        int length = Integer.parseInt(l1[1]);
        String[] l2 = line2.split(" ");
        long[] types = new long[length];
        for (int i = 0; i < types.length; i++) {
            types[i] = Long.parseLong(l2[i]);
        }

        long temp = hamsters % types[0];
        int j = 0;
        for (int i = 0; i < types.length; i++) {
            long temp2 = hamsters % types[i];
            if (temp2 < temp) {
                temp = temp2;
                j = i;
            } else {
                continue;
            }
        }

        long boxType = j + 1;

        long boxesRequried = hamsters / types[j];

        long[] result = {boxType, boxesRequried};


        return result;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();
        long[] result = typeAndNumberOfBoxes(line1, line2);
        String s = "";
        for (int i = 0; i < result.length; i++) {
            s += result[i];
            if(i != result.length-1){
                s = s.concat(" ");
            }
        }
        System.out.println(s);
        br.close();

    }
}



