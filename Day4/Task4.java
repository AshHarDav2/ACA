package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value % 5 == 0){
            System.out.println("multiple of 5");
        }else {
            System.out.println("not multiple of 5");
        }

    }
}
