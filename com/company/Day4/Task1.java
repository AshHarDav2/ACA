package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("eligible to vote");
        }
        else
            System.out.println("not allowed to vote");
    }
}
