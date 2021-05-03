package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number == 0) {
            System.out.println("number is zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
        if (Math.abs(number) < 1) {
            System.out.println("small");
        } else if (Math.abs(number) > 1000000) {
            System.out.println("large");
        }

    }
}
