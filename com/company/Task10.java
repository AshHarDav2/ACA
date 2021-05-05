package com.company.Day8;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        int start = 0, end = size - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");

    }
}
