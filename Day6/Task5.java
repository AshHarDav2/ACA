package com.company.Day6;


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int PowOf2 = 1;
        while (true) {
            if (PowOf2 <= Number) {
                System.out.println(PowOf2);
                PowOf2 *= 2;
            } else
                break;
        }

    }
}
