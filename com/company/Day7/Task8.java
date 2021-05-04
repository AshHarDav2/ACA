package com.company.Day7;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number;
        do {
            System.out.print("Number = ");
            Number = scanner.nextInt();
        } while (Number > 2*109);
        for (int i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                System.out.println(i);
            }

        }
    }
}
