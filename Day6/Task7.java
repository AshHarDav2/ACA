package com.company.Day6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        while (Number > 0) {
            if (Number % 2 == 0) {
                System.out.println(Number);
            }
            Number--;
        }
    }
}
