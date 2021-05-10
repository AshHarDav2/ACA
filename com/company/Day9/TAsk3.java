package com.company.Day9;

import java.util.Random;
import java.util.Scanner;

public class TAsk3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        boolean simetric = false;
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(5);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (matrix[i][j] == matrix[j][i])
                    count++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if (count==n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}


