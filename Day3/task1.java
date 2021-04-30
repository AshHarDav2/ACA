package com.company;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte myByte = scanner.nextByte();
        short myShort =  myByte;
        int myInt =  myShort;
        long myLong =  myInt;
        float myFloat = (float) myLong;
        double myDouble = myFloat;

        System.out.print("my byte = " + myByte);
        System.out.print("\nmy short = " + myShort);
        System.out.print("\nmy int = " + myInt);
        System.out.print("\nmy long = " + myLong);
        System.out.print("\nmy float = " + myFloat);
        System.out.print("\nmy double = " + myDouble);
    }
}
