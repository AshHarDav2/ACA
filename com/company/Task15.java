package com.company.Day8;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(), i = 0;
        int[] array = new int[size];
        boolean alone = true;
        for (i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        for (i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    alone = false;
                    break;
                }
            }
            if (alone) {
                System.out.println(array[i]);
            }
        }
    }
}
