package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X1 = scanner.nextInt();
        int Y1 = scanner.nextInt();
        int X2 = scanner.nextInt();
        int Y2 = scanner.nextInt();
        if ((float)X1/X2>0 && (float)Y1/Y2>0){
            System.out.println("in the same quarter");
        }else{
            System.out.println("not in the same quarter");
        }
    }
}
