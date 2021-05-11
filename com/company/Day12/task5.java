package com.company.week3.Day12;

public class task5 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 8};
        System.out.println(search(array));
        System.out.println(search(array, 2));
        System.out.println(search(array, array.length - 1, 8));

    }

    static int search(int[] array) {
        System.out.print("array length = ");
        return array.length;
    }

    static int search(int[] array, int element) {
        System.out.print(element + " index = ");
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return 0;
    }

    static boolean search(int[] array, int index, int element) {
        System.out.print("is in right place = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element && i == index)
                return true;
        }
        return false;
    }
}
