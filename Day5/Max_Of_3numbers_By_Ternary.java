package com.company;

import java.util.Scanner;

public class Max_Of_3numbers_By_Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("\nb = ");
        int b = scanner.nextInt();
        System.out.print("\nc = ");
        int c = scanner.nextInt();
        int max = a>b ? a : b;
        max = c > max ? c: max;
        System.out.println(max);
    }
}
