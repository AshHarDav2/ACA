package com.company.Day10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = 1;
        if (N >= 1 && N <= 15) {
            for (int i = 0; i <N; i++) {
                result *= 2;
            }
            System.out.println(result);
        }
        else{
            System.out.println("try again");
        }
    }
}
