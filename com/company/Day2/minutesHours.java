package com.company;

import java.util.Random;
import java.util.Scanner;

public class minutesHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" enter minutes to convert");
        double minutes = scanner.nextDouble();
        double hours = minutes / 60;
        System.out.println(hours);

    }

}

