package com.company.Day7;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int count = 0;
        for (int i = 1; ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                count++;
                if (count == limit)
                    break;
            }
            if (count == limit)
                break;
        }
    }
}
