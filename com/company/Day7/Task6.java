package com.company.Day7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number;
        do {
            System.out.print("Number = ");
            Number = scanner.nextInt();
        } while (Number < 2 || Number > 30000);
        for (int i = 2; i <= Number; i++) {
            if (Number % i == 0) {
                System.out.println(i);
                break;
            }

        }
    }
}
