package com.company;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a>b ? a + " is greater" : b + " is greater");
        System.out.println(a < 0 ? a*=-1: a);
        System.out.println(b < 0 ? b*=-1: b);
    }
}
