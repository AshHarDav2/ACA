package com.company.Day6;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        boolean NumberIsPowOf2 = false;
        while (true) {
            int Number = scanner.nextInt();
            int PowOf2 = 1;
            while (PowOf2 <= Number) {
                if (Number / PowOf2 == 1 && Number % PowOf2 == 0) {
                    System.out.println(Number);
                    System.out.println(count);
                    NumberIsPowOf2 = true;
                    break;
                } else {
                    PowOf2 *= 2;
                }
            }
            if (NumberIsPowOf2 == true)
                break;
            count++;
        }
    }
}

