package com.company.Day8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        int max = array[0];
        int max_index = 0;
        for (int i =1; i<size; i++){
            if (array[i]>max){
                max=array[i];
                max_index = i;
            }
        }
        System.out.print("max = " + max + " index = " + max_index);
    }
}


