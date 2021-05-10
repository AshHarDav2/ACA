package com.company.Day9;

import java.util.Random;
import java.util.Scanner;

public class TAsk4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sum = 0, max = 0, max_index = 0;
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(5);
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
                max_index = i;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("max = " + max + " max index = " + max_index);
    }
}


