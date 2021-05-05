package com.company.Day8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                if (array[i] > 0 && array[i + 1] > 0 || array[i] < 0 && array[i + 1] < 0) {
                    System.out.print(array[i] + " " + array[i + 1]);
                    break;
                }
            }
        }
    }
}

