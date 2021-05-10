package com.company.Day9;

import java.util.Scanner;

public class TAsk2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1)
                    matrix[i][j] = 1;
                else if (i + j > size-1)
                    matrix[i][j] = 0;
                else
                    matrix[i][j] = 2;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
