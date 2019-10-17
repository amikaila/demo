package com.swedbank.gyk2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        Autoboxing
//        Integer intVariable = new Integer(23);
//        Integer intVariable = 23;
        Integer intVariable = Integer.valueOf(23);

//        Unboxing
        int intPrimitive = intVariable.intValue();

        String carColor = "Red";
        System.out.println(carColor.length());
        System.out.println(carColor.toUpperCase());
        System.out.println(carColor.toLowerCase());
        System.out.println(carColor.concat("purple"));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Please enter your surname:");
        String lastName = input.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("Your name in upperCase: " + name.toUpperCase() + " Concatinated: " + name.concat(lastName));
        input.close();
    }
}
