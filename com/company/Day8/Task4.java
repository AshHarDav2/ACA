package com.company.Day8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (i != 0) {
                if (array[i] > array[i - 1]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
