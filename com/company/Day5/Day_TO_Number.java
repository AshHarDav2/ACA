package com.company;

import java.util.Scanner;

public class Day_TO_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Day = scanner.nextLine();
        switch (Day) {
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("4");
                break;
            case "Friday":
                System.out.println("5");
                break;
            case "Saturday":
                System.out.println("6");
                break;
            case "Sunday":
                System.out.println("7");
                break;
            default:
                System.out.println("no such day");
                break;
        }
    }
}
