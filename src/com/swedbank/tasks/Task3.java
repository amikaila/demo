package com.swedbank.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[3];
        System.out.println("Enter first grade: ");
        arr[0] = input.nextDouble();
        System.out.println("Enter second grade: ");
        arr[1] = input.nextDouble();
        System.out.println("Enter third grade: ");
        arr[2] = input.nextDouble();
        System.out.println("Average of students grade is: " + (arr[0] + arr[1] + arr[2]) / 3);
    }
}
