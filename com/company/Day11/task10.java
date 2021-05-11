package com.company.week3.Day11;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println(HasEight());
    }

    static boolean HasEight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number = ");
        boolean haEight = false;
        String number = scanner.next();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '8'){
                return true;
            }
        }
        return false;
    }
}
