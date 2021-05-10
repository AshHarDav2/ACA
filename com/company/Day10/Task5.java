package com.company.Day10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean polintrom = true;
        System.out.print("number length: ");
        int Number_Length = scanner.nextInt();
        int[] Number_Digits = new int[Number_Length];
        System.out.print("low limit = ");
        int Low_Limit = scanner.nextInt();
        System.out.print("upper limit = ");
        int Up_Limit = scanner.nextInt();
        for (int i = Low_Limit; i <= Up_Limit; i++) {
            polintrom = true;
            int number = i;
            for (int j = Number_Length - 1; j >= 0; j--) {
                Number_Digits[j] = number % 10;
                number = number / 10;
            }
            for (int j = 0; j < Number_Length / 2; j++) {
                if (Number_Digits[j] != Number_Digits[Number_Length - 1 - j]) {
                    polintrom = false;
                    break;
                }
            }
            if (polintrom) {
                System.out.println(i);
            }
        }
    }
}
