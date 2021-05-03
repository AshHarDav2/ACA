package com.company;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("Case1");
                break;
            case 2:
                System.out.println("Case2");
                break;
            case 3:
                System.out.println("Case3");
                break;
            case 4:
                System.out.println("Case4");
                break;

            default:
                System.out.println("nothing");
        }
    }
}
