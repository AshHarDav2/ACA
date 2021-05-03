package com.company.Day6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        for (int i= 1; i<=Math.sqrt(Number); i++){
            System.out.println(i*i);
        }
    }
}
