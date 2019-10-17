package com.swedbank.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle radius between 0 and 1000");
        double radius = input.nextDouble();
        System.out.println("Circle diameter is: " + 2 * radius + "\n" + "Circle perimeter is: " + Math.PI * 2 * radius
                + "\n" + "Circle area is: " + Math.PI * radius * radius);
    }
}
