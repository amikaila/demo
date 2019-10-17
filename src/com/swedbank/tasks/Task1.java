package com.swedbank.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's is your name?");
        String name = input.nextLine();
        System.out.println("What's is your last name?");
        String surname = input.nextLine();
        System.out.println("What's is your work area?");
        String workarea = input.nextLine();
        System.out.println("How many years you been working on it?");
        int years = input.nextInt();
        System.out.println("Hello, I'm " + name + " " + surname + " and I work in " + workarea + " for " + years + " years.");
    }
}
