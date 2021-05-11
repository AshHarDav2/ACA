package com.company.week3.Day12;

public class task4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        float[] array2 = {34.5f, 54.1f, 89.3f, 4.5f};
        double[] array3 = {1.2, 43.5, 6.7, 4, 6};

        print(array1);
        print(array2);
        print(array3);
    }

    static void print(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            if (i == 0){
                System.out.print("[" + array1[i] + ", ");
                continue;
            }
            if (i == array1.length-1){
                System.out.print(array1[i] + "]");
                break;
            }
            System.out.print(array1[i] + ", ");
        }
    }

    static void print(float[] array2) {
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            if (i == 0){
                System.out.print("[" + array2[i] + ", ");
                continue;
            }
            if (i == array2.length-1){
                System.out.print(array2[i] + "]");
                break;
            }
            System.out.print(array2[i] + ", ");
        }
    }

    static void print(double[] array3) {
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            if (i == 0){
                System.out.print("[" + array3[i] + ", ");
                continue;
            }
            if (i == array3.length-1){
                System.out.print(array3[i] + "]");
                break;
            }
            System.out.print(array3[i] + ", ");
        }

    }
}
