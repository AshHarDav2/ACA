package com.company;

import java.util.Scanner;

public class Score_Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quiz score: ");
        int Quiz = scanner.nextInt();
        System.out.print("\nMid-Term Score: ");
        int Mid_Term = scanner.nextInt();
        System.out.print("\nFinal Score: ");
        int Final = scanner.nextInt();
        int average = (Quiz + Mid_Term + Final) / 3;
        switch (average / 20) {
            case 2:
                System.out.println("Your grade is C");
                break;
            case 3:
                System.out.println("Your grade is B");
                break;
            case 4:
                System.out.println("Your grade is A");
                break;
            default:
                System.out.println("no such grade");
                break;
        }
    }
}
