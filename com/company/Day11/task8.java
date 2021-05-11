package com.company.week3.Day11;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter letter: ");
        System.out.println(Vowel(scanner.next()));
    }

    static boolean Vowel(String letter) {
        boolean IsVowel = false;
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
            IsVowel = true;
        return IsVowel;
    }
}
