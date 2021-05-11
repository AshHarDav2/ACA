package com.company.week3.Day11;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        System.out.println(Factorial(scanner.nextInt()));
    }

    static int Factorial(int number) {
        int Factorial = 1;
        for (int i = 1; i <= number; i++) {
            Factorial*=i;
        }
        return Factorial;
    }
}
