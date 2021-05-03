package com.company;

import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("number=");
        number = scanner.nextInt();
        int secondDigit = (number / 10)%10;
        System.out.println("second digit = " + secondDigit);
    }
}
