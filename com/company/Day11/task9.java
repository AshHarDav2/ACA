package com.company.week3.Day11;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println(IsPalindrome());
    }

    static boolean IsPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digits: ");
        int digits = scanner.nextInt();
        System.out.print("number to check palindrome: ");
        int number = scanner.nextInt();
        boolean IsPalindrome = true;
        int[] reverse_number = new int[digits];
        int[] number_array = new int[digits];
        int count = 0;

        for (int i = number; i > 0; i /= 10) {
            {
                number_array[count] = i % 10;
                count++;
            }
        }
        for (int i = 0; i < digits; i++) {
            reverse_number[i] = number_array[digits - 1 - i];
        }

        for (int i = 0; i < digits; i++) {
            if (number_array[i] != reverse_number[i]) {
                return false;
            }
        }
        return true;
    }
}
