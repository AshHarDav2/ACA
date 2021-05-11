package com.company.week3.Day11;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[] massive = Input();
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        int Min_Four = Min_Of_Four(massive);
        System.out.println();
        System.out.println(Min_Four);
    }

    static int[] Input() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = scanner.nextInt();
        }
        return sequence;
    }

    static int Min_Of_Four(int[] sequence) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            if (sequence[i] < min)
                min = sequence[i];
        }
        return min;
    }

}
