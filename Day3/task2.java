package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter double ");
        double myDouble = scanner.nextDouble();
        float f = (float) myDouble;
        long l = (long) f;
        int i = (int) l;
        short sh = (short) i;
        byte b = (byte) sh;

        System.out.print("double = " + myDouble);
        System.out.print("\nfloat = " + f);
        System.out.print("\nlong = " + l);
        System.out.print("\nint = " + i);
        System.out.print("\nshort = " + sh);
        System.out.print("\nbyte = " + b);
    }
}
