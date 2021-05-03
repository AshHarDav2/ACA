package com.company.Day6;

import java.util.Scanner;

public class Increasing_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min, max;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a>b){
            max = a;
            min = b;
        }else{
            min = a;
            max = b;
        }
    }
}
