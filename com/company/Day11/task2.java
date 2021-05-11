package com.company.week3.Day11;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println(Pow_Of_a());
    }

    static int Pow_Of_a() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter pow of: ");
        int a = scanner.nextInt();
        System.out.print("pow to: ");
        int n = scanner.nextInt();
        double result = Math.pow(a, n);
        return (int) result;
    }
}
