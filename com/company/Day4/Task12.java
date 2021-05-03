package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a % 7 == 0 || b % 10 == 0) && (a > 0 && b > 0) && a > b){
            condition = true;
        }else{
            condition=false;
        }
        System.out.println(condition);

    }
}
