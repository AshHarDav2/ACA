package com.company.Day10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input minutes");
        int minutes = scanner.nextInt(), hours;
        int minutes_left_After0;

        if (minutes >= 0 && minutes <= 59)
            System.out.println(minutes + " minutes");

        if (minutes >= 60 && minutes < 1440) {
            hours = minutes / 60;
            minutes -= hours * 60;
            System.out.println(hours + " hours " + minutes + " minutes passed");
        }

        if (minutes >= 1440) {
            for (int k = 1; true; k++) {
                minutes_left_After0 = minutes - 1440 * k;
                if (minutes_left_After0 < 1440) {
                    break;
                }
            }
            hours = minutes_left_After0/60;
            minutes = minutes_left_After0 - hours*60;
            System.out.println(hours + " hours " + minutes + " minutes");
        }

    }
}
