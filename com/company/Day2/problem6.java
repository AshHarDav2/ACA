package com.company;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("number1=");
        number1 = scanner.nextInt();
        System.out.print("number2=");
        number2 = scanner.nextInt();
        System.out.print("number3=");
        number3 = scanner.nextInt();
        int sum = number1 + number2 + number3;
        double average = sum/3f;
        int difference = number1-number2-number3;
        System.out.print("sum=" + sum);
        System.out.print("\ndifference=" + difference);
        System.out.print("\naverage=" + average);
    }
}
