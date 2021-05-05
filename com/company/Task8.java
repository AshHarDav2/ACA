package com.company.Day8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (array[i] == array[j])
                    break;
            }
            if (i == j)
                count++;
        }
        System.out.println(count);
    }
}