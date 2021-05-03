package com.company;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        switch (letter) {
            case 'a':
                System.out.println(letter + " is Vowel");
                break;
            case 'e':
                System.out.println(letter + " is Vowel");
                break;
            case 'i':
                System.out.println(letter + " is Vowel");
                break;
            case '0':
                System.out.println(letter + " is Vowel");
                break;
            case 'u':
                System.out.println(letter + " is Vowel");
                break;
            default:
                System.out.println(letter + " is Consonant");
        }
    }
}
