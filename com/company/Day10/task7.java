package com.company.Day10;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[][] matrix = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 'O';
                } else {
                    matrix[i][j] = 'X';
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

