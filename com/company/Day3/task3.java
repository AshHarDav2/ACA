package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(celsius);
        float data = (float) celsius;
        int data2 = (int) data;
        System.out.println(data);
        System.out.println(data2);
    }
}
