package com.swedbank.Lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(System.in);
            int first = input.nextInt();
            int second = input.nextInt();
            int result = first/second;

        } catch (ArithmeticException e) {
            System.out.println("Dalyba is nulio" + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Skaicius neglai buti zodis " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
