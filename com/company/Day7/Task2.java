package com.company.Day7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        System.out.print("d = ");
        int d = scanner.nextInt();
        for (int i = a; i <= b; i++)
            if (i % d == c)
                System.out.println(i);
    }
}
