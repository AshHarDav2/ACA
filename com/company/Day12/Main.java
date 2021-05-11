package com.company.week3.Day12;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("size of array = ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(5);
        }
        System.out.print("rows of matrix = ");
        int n = scanner.nextInt();
        System.out.print("columns of matrix = ");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(6);
            }
        }
        printArray(array);
        printMatrix(matrix, n, m);
        System.out.println(average(array));
        System.out.println(average(matrix, n, m));

    }

    static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void printMatrix(int[][] matrix, int n, int m) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static float average(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / (float) array.length;
    }

    static float average(int[][] matrix, int n, int m) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
        }
        return sum / (float) (n * m);
    }
}
