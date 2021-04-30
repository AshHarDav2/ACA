package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean condition=false;
        int RandomNumber = random.nextInt();
        if (RandomNumber>-1000 && RandomNumber<1000 && RandomNumber%3==0 && RandomNumber%5==0){
            condition=true;
        }
        System.out.println(condition);


    }
}
