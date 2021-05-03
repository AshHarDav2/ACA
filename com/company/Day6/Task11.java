package com.company.Day6;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int i = 1;
        while (i <= Number) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
