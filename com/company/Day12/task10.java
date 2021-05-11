package com.company.week3.Day12;

public class task10 {
    public static void main(String[] args) {
        System.out.println(SumOfDigits(442));
        System.out.println(SumOfDigits(331, 5));
    }

    static int SumOfDigits(int value) {
        int sum = 0;
        for (int i = value; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }

    static float SumOfDigits(int value, int number) {
        int sum = 0;
        for (int i = value; i > 0; i /= 10) {
            sum += i % 10;
        }
        return (float)sum / number;
    }
}
