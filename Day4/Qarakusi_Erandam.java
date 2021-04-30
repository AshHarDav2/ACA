package com.company;

import java.util.Scanner;

public class Qarakusi_Erandam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("\nb = ");
        float b = scanner.nextFloat();
        System.out.print("\nc = ");
        float c = scanner.nextFloat();
        double D = Math.pow(b, 2) - 4 * a * c;
        if (a == 0 && b != 0) {
            System.out.println(-c / b);
        } else if (a == 0 && b == 0) {
            System.out.println("no decision");
        } else if (D == 0) {
            System.out.println(-b / 2 * a);
        } else if (D > 0) {
            System.out.println((-b + Math.sqrt(D)) / 2);
            System.out.println((-b - Math.sqrt(D)) / 2);
        } else {
            System.out.println("no decision");
        }
    }
}
