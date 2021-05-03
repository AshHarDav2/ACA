package com.company.Day6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int p = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;
        while (x <= y) {
            x = x + x * p / 100;
            System.out.println(x);
            count++;
        }
        System.out.println(count);
    }
}


