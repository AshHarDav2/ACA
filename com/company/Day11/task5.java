package com.company.week3.Day11;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println(prime());
    }

    static boolean prime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        boolean isPrime = true;
        int number = scanner.nextInt();
        for (int i = (int) Math.sqrt(number); i > 1; i--) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
