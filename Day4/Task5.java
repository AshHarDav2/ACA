package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextShort();
        if (a > b) {
            b = a;
        }
        if (b > c) {
            c = b;
        }
        System.out.println("max is " + c);
    }
}
