package com.problemset;


import java.util.*;

public class EvenOdds {
    // would not work with range greater than long
    private static long numberAtKthPosition(long n, long k) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (long i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddList.add((int) i);
            } else {
                evenList.add((int) i);
            }
        }
        int[] odd = new int[oddList.size()];
        int[] even = new int[evenList.size()];
        int index = 0;

        for (int i : oddList) {
            odd[index++] = i;
        }
        index = 0;
        for (int i : evenList) {
            even[index++] = i;
        }

        int[] result = new int[odd.length + even.length];
        System.arraycopy(odd, 0, result, 0, odd.length);
        System.arraycopy(even, 0, result, odd.length, even.length);


        return result[(int) k - 1];
    }


    public static long find(long n, long member) {
        long oddTotal = (long) Math.ceil(n / 2.0);

        long k = 0;

        if (member <= oddTotal) {
            k = findOdd(member);
        } else {
            k = findEven(member - oddTotal);
        }

        return k;
    }

    public static long findEven(long member) {
        return 2 * member;
    }

    public static long findOdd(long member) {
        return --member * 2 + 1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        long n = Long.parseLong(line1[0]);
        long k = Long.parseLong(line1[1]);

        System.out.println(find(n, k));

        scanner.close();

    }
}
