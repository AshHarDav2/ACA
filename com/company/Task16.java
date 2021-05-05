package com.company.Day8;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int i = 0;
        while (i < size) {
            if (array[i] == 0) {
                for (int j = 0; j < size-1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            i++;
            if (array[i-1] == 0)
                i--;

        }
        for (i = 0; i < size; i++)
            System.out.print(array[i] + " ");
    }
}
