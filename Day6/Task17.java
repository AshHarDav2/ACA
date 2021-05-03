package com.company.Day6;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Number = scanner.next();
        int digits = Number.length();
        System.out.println("digits are " + digits);
        int DigitsSum = 0;
        int i = 0;
        while (i<digits) {
            DigitsSum += Number.charAt((args.length)-i);
            i++;
        }
        System.out.println(DigitsSum);
    }
}
