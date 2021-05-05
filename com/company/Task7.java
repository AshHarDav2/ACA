package com.company.Day8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0, abs_Of_all = 0;
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            abs_Of_all += Math.abs(array[i]);
        }
        if (abs_Of_all < 1000) {
            i = 0;
            while (array[i] <= 0)
                i++;
            int min = array[i];
            for (i = i+1; i < size; i++)
                if (array[i] < min && array[i] >= 0)
                    min = array[i];
            System.out.println(min);
        } else {
            System.out.println("try again");
        }

    }

}



