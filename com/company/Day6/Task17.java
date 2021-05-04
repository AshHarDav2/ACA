package com.company.Day6;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int x = Number;
        int length = 0, sum = 0;
        while(x!=0){
            x/=10;
            length++;
        }
        for (int i =0; i<length; i++){
            sum += Number%10;
            Number/=10;
        }
        System.out.println(sum);
    }
}
