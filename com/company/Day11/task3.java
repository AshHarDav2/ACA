package com.company.week3.Day11;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println(XOR());
    }

    static boolean XOR() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("first argument = ");
        boolean argument1 = scanner.nextBoolean();
        System.out.print("second argument = ");
        boolean argument2 = scanner.nextBoolean();
        if (argument1 == argument2) {
            return false;
        }else {
            return true;
        }
    }
}
