package com.company.week3.Day11;

import java.util.Random;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        System.out.println(contains());
    }

    static boolean contains(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(50)-20;
            System.out.print(array[i] + " ");
        }
        System.out.print("\ninteger to check whether contains or not: ");
        int numberToCheck = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            if (array[i] == numberToCheck)
                return true;
        }
        return false;
    }
}
