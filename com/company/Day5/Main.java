package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number = ");
        int Number = scanner.nextInt();
        switch ((Number + 44 + 1) / 45) {
            case 1:
                System.out.print(Number + "is in range 0 - 44");
                break;
            case 2:
                System.out.print(Number + "is in range 45 - 90");
                break;
            case 3:
                System.out.print(Number + "is in range 90-134");
                break;
            default:
                System.out.print("number is not in the given ranges");
                break;
        }
    }
}
