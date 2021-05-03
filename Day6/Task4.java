package com.company.Day6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        for (int i =2; i<=Number; i++){
            if (Number%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
