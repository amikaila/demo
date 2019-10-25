package com.swedbank.tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rectangle lenght: ");
        double lenght = input.nextDouble();
        System.out.println("Please enter rectangle width: ");
        double width = input.nextDouble();
        System.out.println("Rectangle lenght: " + lenght + "\n" + "Rectangle width: " + width);
        System.out.println("Perimeter: " + 2*(lenght+width));
        System.out.println("Area: " + (lenght*width));
    }
}
