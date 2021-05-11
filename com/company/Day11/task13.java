package com.company.week3.Day11;

import java.util.Random;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        System.out.println("\nindex = " + search());
    }

    static int search() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(50)-10;
            System.out.print(array[i] + " ");
        }
        System.out.print("\nint to search: ");
        int number = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }
}
