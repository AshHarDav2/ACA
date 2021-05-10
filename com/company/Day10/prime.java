package com.company.Day10;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        }
        for (int i = (int)Math.sqrt(n); i > 1; i--) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }


}

