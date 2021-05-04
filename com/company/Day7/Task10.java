package com.company.Day7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("binary: ");
        int Binary = scanner.nextInt(), length = 0;
        long x = Binary;
        double decimal = 0;
        while (x != 0) {
            x /= 10;
            length++;
        }
        for (int i = 0; i < length; i++) {
            int digit = Binary % 10;
            decimal = decimal + digit*Math.pow(2,i);
            Binary /= 10;

        }
        System.out.println((int)decimal);
    }
}
