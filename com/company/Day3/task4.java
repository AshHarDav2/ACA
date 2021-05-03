package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input radius: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        double perimeter = 2 * Math.PI * radius;

        System.out.print("area of circle = " + area);
        System.out.print("\nperimeter of circle = " + perimeter);

    }
}
