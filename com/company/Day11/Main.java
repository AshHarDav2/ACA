package com.company.week3.Day11;

public class Main {

    public static void main(String[] args) {
        int[] Array = {1, 3, -7, 4, -3, 5};
        PrintArray(Array);
        Reverse_Array(Array);
        Print_Reverse_Array(Array);
    }


    static void PrintArray(int[] Array) {
        for (int i = 0; i < Array.length; i++)
            System.out.print(Array[i] + " ");
    }

    static void Reverse_Array(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] *= -1;
        }
    }

    static void Print_Reverse_Array(int[] Array) {
        System.out.println();
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}

