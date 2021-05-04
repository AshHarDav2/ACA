package com.company.Day7;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        for (int i = 1; i<=Number; i++){
            for (int j = 1; j<=Number; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
