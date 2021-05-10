package com.company.Day9;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Sum = 0;
        int[][] matrix = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int [][] matrix3 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(5);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = random.nextInt(5);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");
        for (int i = 0; i < n;i++) {
            for (int j = 0; j < n;j++) {
                matrix3[i][j] = 0;
                for (int k=0; k<n; k++){
                    matrix3[i][j] += matrix[i][k] * matrix2[k][j];
                }
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
