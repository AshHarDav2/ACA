package com.company.Day9;

import java.util.Random;

public class skizb {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        Random random = new Random();

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(51) + 55;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("sum = " + sum);
    }
}
