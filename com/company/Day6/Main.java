package com.company.Day6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = 4;
        for (int i = 0; i < 3; i++) {
            System.out.println("press 1 for perimeter");
            System.out.println("press 2 for area");
            System.out.println("press 3 to exit");
            String ChoiceByString = scanner.next();
            switch (ChoiceByString) {
                case "1":
                    System.out.println(2 * Math.PI * radius);
                    break;
                case "2":
                    System.out.println(Math.PI * radius * radius);
                    break;
                case "3":
                    continue;
                default:
                    System.out.println("no such choice");
            }
        }


    }
}
