package com.A;

public class HitTheLottery {

    public static int minBills(int number) {
        // 1,5,10,20,100

        if (number - 100 >= 0) {
            return 1 + minBills(number - 100);
        }
        if (number - 20 >= 0) {
            return 1 + minBills(number - 20);
        }
        if (number - 5 >= 0) {
            return 1 + minBills(number - 5);
        }
        if (number - 1 >= 0) {
            return 1 + minBills(number - 1);
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(minBills(10));
    }
}
