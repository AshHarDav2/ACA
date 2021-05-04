package com.company.Day7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        for (int i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                System.out.println(i);
            }

        }
    }
}
