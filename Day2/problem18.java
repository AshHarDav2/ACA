package com.company;

import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {
        int number, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("number=");
        number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = (number / 10)%10;
        int lastDigit = number%10;
        sum = firstDigit + secondDigit + lastDigit;
        System.out.println("sum = " + sum);
    }
}
