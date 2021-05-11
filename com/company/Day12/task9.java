package com.company.week3.Day12;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println(fahrenheitCelsius(10));
        System.out.println(fahrenheitCelsius(32.0));
    }

    static double fahrenheitCelsius(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double fahrenheitCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
