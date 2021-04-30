package com.company;

import java.util.Scanner;

public class Even_Odd_By_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (Math.abs(number) % 2){
            case 0:
                System.out.println("EVEN");
                break;
            case 1:
                System.out.println("ODD");
                break;
        }
    }
}
