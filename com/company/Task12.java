package com.company.Day8;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        int last = array[size - 1];
        for (int j = size - 1; j >= 0; j--) {
            if (j == 0) {
                array[0] = last;
                break;
            }
            array[j] = array[j - 1];
        }
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
    }
}
