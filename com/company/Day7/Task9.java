package com.company.Day7;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int Sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<10; i++){
            int Number = scanner.nextInt();
            Sum += Number;
        }
        System.out.println(Sum);
    }
}
