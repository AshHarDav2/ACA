package com.company.Day6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            length = scanner.nextInt();
        } while (length < 3);
        int i = 0, max;
        while (i < length) {
            int Number = scanner.nextInt();
            max = Number;
            if (Number>max){
                max = Number;
            }
            System.out.println(max);
        }

    }
}
