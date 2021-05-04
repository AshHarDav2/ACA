package com.company.Day7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }
}
