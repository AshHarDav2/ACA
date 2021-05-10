package com.company.Day9;

import java.util.Random;

public class matrix2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[3][3];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90) + 10;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (i + j >= matrix[i].length - 1) {
                    sum += matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("sum = " + sum);
    }
}
