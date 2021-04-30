package com.company;

import java.util.Scanner;

public class xndir8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b=scanner.nextByte();
        short c=scanner.nextShort();
        int a=scanner.nextInt();
        double average = (a+b+c)/3;
        System.out.println(average);
        System.out.println(a*b*c);
    }
}
