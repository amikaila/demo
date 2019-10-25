package com.swedbank.Lesson3;

public class Example {
    public static void main(String[] args) {
        int day = 0;
        if (day == 3) {
            System.out.println("Treciadienis");

        } else if (day == 4) {
            System.out.println("Ketvirtadienis");
        }

        switch (day) {
            case 3:
                System.out.println("treciadienis");
                break;
            case 4:
                System.out.println("ketvirtadienis");
                break;
            default:
                System.out.println("Kita diena");
        }

        if (day > 7 || day < 1) {
            System.out.println("Tai ne savaites diena");
        }
    }
}
