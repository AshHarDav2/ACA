package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int FirstNumber = scanner.nextInt();
        System.out.print("\nEnter second number: ");
        int SecondNumber = scanner.nextInt();
        System.out.print("\nEnter n operator:");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(FirstNumber + SecondNumber);
                break;
            case '-':
                System.out.println(FirstNumber - SecondNumber);
                break;
            case '*':
                System.out.println(FirstNumber * SecondNumber);
                break;
            case '/':
                System.out.println(FirstNumber / SecondNumber);
                break;
            default:
                System.out.println("error, no such case");
                break;
        }
    }
}
