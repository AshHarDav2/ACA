package com.company.Day10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("1 is a unique number");
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (number == i) {
                    System.out.println(number + " is a prime");
                    break;
                } else {
                    System.out.println(number + " is not prime ");
                    break;
                }
            }

        }
    }
}
