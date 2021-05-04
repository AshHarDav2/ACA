package com.company.Day7;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your password: ");
        String password = scanner.next();
        boolean poqratar = false, mecatar = false, tver = false, symbol = false, range = false;
        if (password.length() > 6 && password.length() < 16) {
            range = true;
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                poqratar = true;
                continue;
            }
            if (password.charAt(i) >= '@' && password.charAt(i) <= 'Z') {
                mecatar = true;
                continue;
            }
            if (password.charAt(i) > '0' && password.charAt(i) < '9') {
                tver = true;
                continue;
            }
            if (password.charAt(i) == 36 || password.charAt(i) == 35) {
                symbol = true;
                continue;
            }
        }
        if (poqratar == true && mecatar == true && tver == true && symbol == true && range == true)
            System.out.println("valid password");
        else
            System.out.println("invalid password");
    }
}
