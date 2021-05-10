package com.company.Day10;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int k = 0; true; k++) {
            boolean end = false;
            for (int i = 2; i <= number; i++) {
                boolean isPrime = true;
                for (int j = (int) Math.sqrt(i); j > 1; j--) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                // not to print last multiplication symbol
                if (number == i){
                    System.out.print(i);
                    end = true;
                    break;
                }
                if (isPrime && number % i == 0) {
                    System.out.print(i + "*");
                    number /= i;
                    break;
                }
            }
            if (number == 1)
                break;
            if (end)
                break;
        }
    }
}
