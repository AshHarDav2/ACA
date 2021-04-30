package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>10 && b!=10){
            System.out.println("legal");
        }else{
            System.out.println("not legal");
        }
    }
}
