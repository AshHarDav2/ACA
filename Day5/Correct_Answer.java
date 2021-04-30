package com.company;

import java.util.Scanner;

public class Correct_Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.int 1x=10");
        System.out.println("2.int x=10");
        System.out.println("3.float x=10.0f");
        System.out.println("4.string x=10");
        System.out.print("Enter your choice: ");
        int integer = scanner.nextInt();
        if (integer == 2){
            System.out.println("Congratulations");
        }else {
            System.out.println("Invalid choice");
        }
    }

}
