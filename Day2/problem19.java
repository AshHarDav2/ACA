package com.company;

import java.util.Scanner;

public class problem19 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        a = scanner.nextInt();
        System.out.print("b=");
        b = scanner.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("a=" + a);
        System.out.print("\nb= "+ b);
    }
}
