package com.swedbank.gyk2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1{

    public static final int DAYS_IN_WORK = 5;

    public static void main(String[] args) {
        byte byteVariable = 127;
        short trimHeigh = 10;
        int doorCount = 5;
        long seconds = 10005;
        float pi = 3.14f;
        double money = 123.14;
        boolean isCarAvailable = true;
        char firstAlphabetLetter = 'a';
        double doubleVariable = doorCount;
        System.out.println(doubleVariable);
        int intVariable = (int)money;
        System.out.println(intVariable);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter int variable:");
        int intScannerVariable = scanner.nextInt();
        System.out.println("Your variable int: " + intScannerVariable);
    }
}
