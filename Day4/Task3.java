package com.company;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int random1 = random.nextInt();
        if (random1 < 0) {
            random1 *= -1;
        }
        System.out.println(random1 % 6 + 2 );

    }
}
