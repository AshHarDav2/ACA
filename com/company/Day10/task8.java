package com.company.Day10;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("b1 = ");
        float b = scanner.nextFloat();
        System.out.print("q = ");
        float q = scanner.nextFloat();
        System.out.print("n = ");
        float n = scanner.nextFloat();
        for (int i = 1; i<n; i++){
            b*=q;
        }
        System.out.println(b);
    }
}
