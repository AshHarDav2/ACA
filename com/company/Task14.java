package com.company.Day8;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] array  =new int[size];
        for (int i = 0; i<size; i++)
            array[i] = scanner.nextInt();
        System.out.print("k = ");
        int k = scanner.nextInt();
        for (int i = k; i>0; i--){
            int temp = array[i];
            array[i] = array[i-1];
            array[i-1] = temp;
        }
        for (int i =1 ; i<size; i++)
            System.out.print(array[i] + " ");
    }
}
