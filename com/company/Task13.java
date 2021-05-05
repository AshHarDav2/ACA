package com.company.Day8;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0, maxIndex = 0, minIndex = 0, max = 0, min=0;
        for (i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            max = array[0];
            min = array[0];
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("max = " + max + " min = " + min);
        System.out.println("max index = " + maxIndex + " min index = " + minIndex);
        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
        for (i = 0; i < size; i++)
            System.out.print(array[i] + " ");
    }
}
