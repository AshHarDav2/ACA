package com.company.Day7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number = ");
        int Number = scanner.nextInt();
        System.out.print("DigitOccur = ");
        int DigitOccur = scanner.nextInt();
        int count = 0;
        int Length = 0;
        int NumberHelp=Number;
        while(NumberHelp!=0){
            NumberHelp/=10;
            Length++;
        }
        System.out.print("digits of number = " + Length  + "\n");
        for (int i = 0; i< Length ;i ++) {
            int Digit = Number % 10;
            System.out.println("Digit = " + Digit);
            if (Digit == DigitOccur)
                count++;
            Number = Number / 10;
        }
        System.out.println(count);
    }
}
