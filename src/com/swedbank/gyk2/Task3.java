package com.swedbank.gyk2;

public class Task3 {
    public static void main(String[] args) {
        int intVariable = 2+5;
        System.out.println(intVariable);
        System.out.println(2/5);

        int x = 1;
        System.out.println(x++);
        System.out.println(x);

        int intVariable2 = 2;
        intVariable2 += 5;
        System.out.println(intVariable2);

        String a = "abc";
        String b = "abC";
        System.out.println(a.equals(b));

        int intVariable3 = -4;
        System.out.println("ABS: " + Math.abs(intVariable3));
        System.out.println("POW: " + Math.pow(intVariable3,2));
        System.out.println("Sqrt: " + Math.sqrt(Math.abs(intVariable3)));

        int intvariable4 = -1;

        System.out.println("MAX: " + Math.max(intVariable3, intvariable4));
        System.out.println("MIN: " + Math.min(intVariable3, intvariable4));

        if (intVariable3 < intvariable4) {
            System.out.println("MAX var4: " + intvariable4);
        } else
            System.out.println("MAX var3: " + intVariable3);


        String[] myArr = new String[2];
        myArr[0] = "one";
        System.out.println(myArr[1]);




    }
}
