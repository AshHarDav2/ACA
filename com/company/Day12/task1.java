package com.company.week3.Day12;

public class task1 {
    public static void main(String[] args) {
        add(3, 4);
        add(3.6f, 5);
        add(1, 2, 3);
        add(4, 8.6f);
    }

    static void add(int a, int b, int c){
        System.out.println("3 int types");
        System.out.println(a + b + c);
    }

    static void add (int a, int b){
        System.out.println("2 int types");
        System.out.println(a + b);
    }

    static void add (int a, float b){
        System.out.println("different types");
        System.out.println((float)(a + b));
    }

    static void add (float a, int b){
        System.out.println("different types in different sequence");
        System.out.println(a + b);
    }
}
