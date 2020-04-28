package com.A;


import java.util.Scanner;

public class DesignTutorialLearnFromMath {

    private static boolean checkIfComposite(int number) {
        if (number == 2) {
            return false;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i != 1 && i != number) {
                return true;
            }
        }

        return false;


    }


    private static int[] checkIfANumberCanBeExpressedAsSumeOfCompositeNumbers(String line) {
        int number = Integer.parseInt(line);

        int[] numbers = new int[number - 1];
        numbers[0] = 1;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }


        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (checkIfComposite(numbers[i]) && checkIfComposite(numbers[j]) && numbers[i] + numbers[j] == number) {
                break;
            }
            i++;
            j--;
        }

        int[] result = {numbers[i], numbers[j]};


        return result;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int[] result = checkIfANumberCanBeExpressedAsSumeOfCompositeNumbers(line);
        String s = "";
        for (int i = 0; i < result.length; i++) {
            s += result[i];
            if (i != result.length - 1) {
                s = s.concat(" ");
            }
        }
        System.out.println(s);
        scanner.close();

    }
}
