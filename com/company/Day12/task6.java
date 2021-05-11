package com.company.week3.Day12;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("radius = ");
        int radius = scanner.nextInt();
        System.out.println(calculateSquare(radius));

        System.out.print("size1 = ");
        int size1 = scanner.nextInt();
        System.out.print("size2 = ");
        int size2 = scanner.nextInt();
        System.out.println(calculateSquare(size1, size2));

        System.out.print("side of square = ");
        float square = scanner.nextFloat();
        System.out.println(calculateSquare(square));

    }

    static double calculateSquare(int radius) {
        return Math.PI * radius * radius;
    }

    static double calculateSquare(float square) {
        return square * square;
    }

    static double calculateSquare(int side1, int side2) {
        return side1 * side2 / 2.0;
    }
}
