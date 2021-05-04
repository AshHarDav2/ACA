package com.company.Day7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char symbol = 35;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
            if (i%2==0)
            System.out.print(" ");
        }
    }
}
