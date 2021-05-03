package com.company;

import java.util.Scanner;

public class Degenerate_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if (side1 + side2 < side3 || side1 + side3 < side2 || side3 + side2 < side1) {
            System.out.println("no such triangle");
        } else {
            System.out.println("triangle with such sides do exist");
        }
    }
}
