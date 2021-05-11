package com.company.week3.Day12;

public class task3Mher {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] array = InitializeArray(matrix);
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int[] InitializeArray(int[][] matrix) {
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += matrix[i][j];
            }
            array[i] = sum / 3;
        }
        return array;
    }
}


