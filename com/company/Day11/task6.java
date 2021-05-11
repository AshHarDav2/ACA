package com.company.week3.Day11;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Fibonacci();
    }

    static void Fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("length = ");
        int n = scanner.nextInt();
        int[] Fib = new int[n];
        for (int i = 2; i < n; i++) {
            Fib[0] = 0;
            Fib[1] = 1;
            Fib[i] = Fib[i-1] + Fib[i-2];
        }
        System.out.println(Fib[n-1]);
    }
}
