package com.company.Day7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("quantity of numbers = ");
        int quantity = scanner.nextInt();
        int zeros = 0, negatives = 0, positives = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.print("Number = ");
            int Number = scanner.nextInt();
            if (Number == 0) {
                zeros++;
            } else if (Number > 0) {
                positives++;
            } else {
                negatives++;
            }

        }
        System.out.println("there are " + zeros + " zeros, " + positives + " positives and " + negatives + " negatives");
    }

}

