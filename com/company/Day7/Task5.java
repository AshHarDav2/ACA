package com.company.Day7;

import javax.crypto.spec.PSource;
import javax.sound.sampled.ReverbType;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number = ");
        int Number = scanner.nextInt();
        int Length = 0, Reverse = 0;
        int NumberHelp = Number;
        while (NumberHelp != 0) {
            NumberHelp /= 10;
            Length++;
        }
        for (int i = 0; i < Length; i++) {
            int Digit = Number % 10;
            Reverse = Reverse*10 + Digit;
            Number = Number / 10;
        }
        System.out.println("Reverse = " + Reverse);
    }

}
