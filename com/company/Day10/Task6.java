package com.company.Day10;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] word_Letters = new char[word.length()];
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(0) >= 'a' && (int) word.charAt(0) <= 'z') {
                word_Letters[0] = (char) ((int) word.charAt(0) - 32);
            } else {
                word_Letters[0] = word.charAt(0);
            }
            if ((int) word.charAt(i) >= 'A' && (int) word.charAt(i) <= 'Z') {
                word_Letters[i] = (char) ((int) word.charAt(i) + 32);
            } else {
                word_Letters[i] = word.charAt(i);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word_Letters[i]);
        }
    }
}
