package com.swedbank.Lesson3;

import java.util.Scanner;

public class Uzduotis2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();


        int[] numberArray = new int[size];

        for (int i = 0; i < size; i++) {
            numberArray[i] = i*2;

        }
        for (int i = 0; i < size; i++) {
            System.out.println(numberArray[i]);

        }
    }
}

