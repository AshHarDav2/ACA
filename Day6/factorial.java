package com.company.Day6;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Value = scanner.next();
        int Factorial = 1;
        for (int i = 0; i < Value.length(); i++) {
            if (Value.charAt(i) > 47 && Value.charAt(i) < 57) {
                for (int j = 1; j < Value.charAt(i); j++) {
                    Factorial*=j;
                }
            }else{
                System.out.println("not number");
            }
        }
        System.out.println(Factorial);
    }






}
