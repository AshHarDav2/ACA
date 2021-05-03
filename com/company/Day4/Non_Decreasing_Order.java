package com.company;

import java.util.Scanner;

public class Non_Decreasing_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("\nb = ");
        int b = scanner.nextInt();
        System.out.print("\nc = ");
        int c = scanner.nextInt();
        if (a > b) {
            b = a + b;
            a = b - a;
            b = b - a;
        }
        if (a > c) {
            c = a + c;
            a = c - a;
            c = c - a;
        }
        if (b > c) {
            c = c + b;
            b = c - b;
            c = c - b;
        }
        System.out.println(a + "\n" + b + "\n" + c);
    }
}
