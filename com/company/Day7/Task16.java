package com.company.Day7;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = 42;
        int Number = scanner.nextInt();
        for (int i = 1; i <= Number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
            if (i == Number)
                System.out.println("a)");
        }

        System.out.println("\n");
        for (int a = Number; a >= 1; a--) {
            for (int b = 0; b < a; b++) {
                System.out.print(symbol);
            }
            System.out.println();
            if (a == 1)
                System.out.println("b)");
        }

        System.out.println("\n");
        for (int c = Number; c >= 1; c--) {
            for (int d = 0; d < c; d++) {
                System.out.print(symbol);
            }
            System.out.println();
            if (c == 1)
                System.out.println("c)");
        }
        System.out.println("\n");
        for (int e = 1; e <= Number; e++) {
            for (int f = 0; f < e; f++) {
                System.out.print(symbol);
            }
            System.out.println();
            if (e == Number)
                System.out.println("d)");
        }
    }
}
