package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int RandomNumber = random.nextInt();
        if (RandomNumber < 0) {
            RandomNumber *= -1;
        }
        int WeekDay = RandomNumber%6 +2;
        if (WeekDay == 1)
            System.out.println("MONDAY");
        if (WeekDay == 2)
            System.out.println("Tuesday");
        if (WeekDay == 3)
            System.out.println("Wednesday");
        if (WeekDay == 4)
            System.out.println("Thursday");
        if (WeekDay == 5)
            System.out.println("Friday");
        if (WeekDay == 6)
            System.out.println("Saturday");
        if (WeekDay == 7)
            System.out.println("Sunday");
    }
}
