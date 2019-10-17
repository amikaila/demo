package com.swedbank.gyk2;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's is your name?");
        String name = input.nextLine();
        System.out.println("What's is your surname?");
        String surname = input.nextLine();

        System.out.println("What's is your work area?");
        String workArea = input.nextLine();
        System.out.println("How many years you been working in it?");
        int year = input.nextInt();
        System.out.println("Hello, I'm " + name + " " + surname + " and I work in " + workArea + " for " + year + " years.");
    }
}
