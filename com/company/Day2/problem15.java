package com.company;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isEven = false;

        isEven = number%2==0;
        System.out.println(isEven);
    }
    }
