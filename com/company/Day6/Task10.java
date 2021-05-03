package com.company.Day6;

public class Task10 {
    public static void main(String[] args) {
       char Symbol = 32;
       int Count = 0;
       while(Symbol<122){
        System.out.print(Symbol + " ");
        Count++;
       if (Count%10==0)
           System.out.println();
       Symbol++;
       }
    }
}
