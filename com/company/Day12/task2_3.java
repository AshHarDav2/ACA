package com.company.week3.Day12;

import java.util.Scanner;

public class task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if (a.charAt(a.length() - 1) == 'f') {
            float b = Float.parseFloat(a);
            System.out.println(print(b));
        } else {
            int c = Integer.parseInt(a);
            System.out.println(print(c));
        }
    }

    static int print(int a) {
        System.out.println("int");
        return a;
    }

    static float print(float a) {
        System.out.println("float");
        return a;
    }
}
