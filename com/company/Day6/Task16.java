package com.company.Day6;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while(true){
            int RandomNumber = random.nextInt();
            System.out.println(RandomNumber);
            int Guess = scanner.nextInt();
            if (Guess == RandomNumber){
                System.out.println("yes, you guessed the number");
                break;
            }
            else if (Guess>RandomNumber)
                System.out.println("Too high try again");
            else
                System.out.println("Too low try again");
        }
    }
}
