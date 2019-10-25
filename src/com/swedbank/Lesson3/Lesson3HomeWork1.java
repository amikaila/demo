package com.swedbank.Lesson3;

import java.util.Scanner;

public class Lesson3HomeWork1 {
    public static void main(String[] args) {

        final int rows = 3;
        for (int row = 1; row <= rows; row++) {
            for (int i = 0; i < (rows - row); i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (row); i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

//    {
//        //Scanner input = new Scanner(System.in);
//        int size = 3;
//        int k = 1;
//        for (int i = 0; i < size; i++) {
//            for (int j = 1; j <= size; j++) {
//                if (j <= k)
//                    System.out.print("*");
//            }
//            k++;
//            System.out.println();
//        }
//    }
//}


//1
//123
//12345
//123
//12
//1
