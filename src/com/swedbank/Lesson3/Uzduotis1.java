package com.swedbank.Lesson3;

import java.util.Scanner;

public class Uzduotis1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int x = input.nextInt();
        System.out.println("Please enter second number:");
        int y = input.nextInt();
        System.out.println("Please enter a word:");
        String word = input.next();
        input.close();
        if (word.length() > x && word.length() < y) {
            System.out.println("A perfect word");
        } else {
            System.out.println("First number: " + x +
                    "\n" + "Second number: " + y +
                    "\n" + "Word lenght: " + word.length());
        }
    }
}
