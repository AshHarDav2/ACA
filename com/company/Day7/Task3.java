package com.company.Day7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        do {
            System.out.print("a = ");
            a = scanner.nextInt();
            System.out.print("b = ");
            b = scanner.nextInt();
        } while (a >= b);
        for (int i = a; i < b; i++)
            if (i % Math.sqrt(i) == 0)
                System.out.println(i);
    }
}
