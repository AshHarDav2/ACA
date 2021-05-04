package com.company.Day6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int  max = Number, max2=0;
        while (Number!=0) {
            Number = scanner.nextInt();
            if(Number==0)
                break;
            if (Number > max) {
                max2 = max;
                max = Number;
            }
            else if (Number>max2 && Number!=max)
                max2 = Number;
        }
        System.out.println(max2);
    }
}
