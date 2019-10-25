package com.swedbank.Lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotis4 {
    public static void main(String[] args) {
        try (Scanner input  = new Scanner(System.in)){
            System.out.println("Please add first number: ");
            int firstNumber = input.nextInt();
            System.out.println("Please add second number: ");
            int secondNumber = input.nextInt();
            int divided = firstNumber/secondNumber;
        }
        catch (ArithmeticException e) {
            System.out.println("Divided by 0 not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Input numbers is incorrect.");
        }
        catch (Exception e) {
            System.out.println("Klaida!");
        }

    }
}
