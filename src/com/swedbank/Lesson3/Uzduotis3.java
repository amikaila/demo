package com.swedbank.Lesson3;


import java.util.Scanner;

public class Uzduotis3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please add array size: ");
        int x = input.nextInt();
        String[] stringArray = new String[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Enter the word to array: ");
            //String word = input.next();
            stringArray[i] = input.next();

        }
        input.close();

        int i = 0;
        while (i < x) {
            System.out.println("Array element: " + stringArray[i]);
            i++;

        }

        for (String word : stringArray) {
            System.out.println(word);
        }
    }
}
