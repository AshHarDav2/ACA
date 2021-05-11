package com.company.week3.Day11;

public class task14 {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(copyOf(array)[i] + " ");
        }
    }
    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }
}

