package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("tiv gri: ");
        int tiv = scanner.nextInt();
        if (tiv %3 ==1){
            System.out.println(tiv + " = " + 2 * tiv + " * 3 - " + tiv + " * 5");
        }
        if (tiv %3==2){
            System.out.println(tiv + " = " + 4 * tiv/2 + " * 3 - " + 2 * tiv/2 + " * 5");
        }
        if (tiv%3==0){
            System.out.println(tiv + " = 3 * " + tiv/3);
        }
    }
}
