package com.company;

import java.util.Random;

public class problem12 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 15, max = 30;
        int range = (max - min) + 1;
        int RandomINt = max - random.nextInt(range);
        System.out.println(RandomINt);
    }
}
