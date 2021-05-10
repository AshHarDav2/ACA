package com.company.Day9;

import java.util.Random;
import java.util.Scanner;

public class Davo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int count = 1;
        int[][] matrix = new int[n][n];
        //for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = count;
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            count++;
            for(int i=1; i<n; i++){
                for (int j=1; j<n; j++){
                    matrix[i][j] = count;
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        //}
    }
}
