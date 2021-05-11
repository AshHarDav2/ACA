package com.company.week3.Day12;

import java.util.Scanner;

public class task7 {
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

        System.out.println(max(a, b));
        System.out.println(max(a, b, c));
        System.out.println(max(a, b, c, d));

    }

    static int max(int a, int b) {
        int max = Integer.MIN_VALUE;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    static int max(int a, int b, int c, int d) {
        return max (max( max(a, b), c), d);
    }
}
