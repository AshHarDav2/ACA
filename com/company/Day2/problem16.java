package com.company;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number=");
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        System.out.println("first digit = " + firstDigit);
    }
}
