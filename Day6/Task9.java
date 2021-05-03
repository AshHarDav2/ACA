package com.company.Day6;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int PowOf2 = 1;
        int k = 0;
        while (true) {
            if (PowOf2 >= Number){
                System.out.println(k);
                break;
            }
            else {
                PowOf2*=2;
                k++;
            }
        }
    }
}
