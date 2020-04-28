package com.problemset;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line1 = scan.nextLine().split(" ");
        String[] line2 = scan.nextLine().split(" ");
        String[] line3 = scan.nextLine().split(" ");
        String[] line4 = scan.nextLine().split(" ");
        String[] line5 = scan.nextLine().split(" ");

        int[][] mat = {
                {parseInt(line1[0]), parseInt(line1[1]), parseInt(line1[2]), parseInt(line1[3]), parseInt(line1[4])},

                {parseInt(line2[0]), parseInt(line2[1]), parseInt(line2[2]), parseInt(line2[3]), parseInt(line2[4])},

                {parseInt(line3[0]), parseInt(line3[1]), parseInt(line3[2]), parseInt(line3[3]), parseInt(line3[4])},

                {parseInt(line4[0]), parseInt(line4[1]), parseInt(line4[2]), parseInt(line4[3]), parseInt(line4[4])},

                {parseInt(line5[0]), parseInt(line5[1]), parseInt(line5[2]), parseInt(line5[3]), parseInt(line5[4])}
        };

        System.out.println(costFunc(mat));

        scan.close();

    }

    public static int costFunc(int[][] mat) {
        int i = 0, j = 0;
        int ilocation = -1, jlocation = -1;
        for (i = 0; i < mat.length; i++) {
            j = 0;
            if (mat[i][j] == 1) {
                ilocation = i;
                jlocation = j;
                break;
            }
            for (; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    ilocation = i;
                    jlocation = j;
                    break;
                }
            }
            if (ilocation != -1 && jlocation != -1) {
                break;
            }


        }


        int steps = 0;
        steps += (2 > ilocation) ? 2 - ilocation : ilocation - 2;
        if (jlocation == 2) {
            return steps;
        } else {
            steps += (2 > jlocation) ? 2 - jlocation : jlocation - 2;
        }


        return steps;
    }

}
