package com.swedbank.Lesson3;

public class Example4 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        try {

            System.out.println(numbers[5] / 0);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Blogas masyvo elementas");
        } catch (Exception e) {
            System.out.println("Klaida");
        }
        System.out.println("Po viso try-catch bloko");
    }
}
