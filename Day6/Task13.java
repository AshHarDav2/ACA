package com.company.Day6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextInt();
        int y = scanner.nextInt(), count=1;
        while(x <= y){
            x = x+x*10/100;
            System.out.println(x);
            count ++;
        }
        System.out.println(count);
    }
}
