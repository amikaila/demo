package com.swedbank.javagyk.homework;

public class Car {
    private int modelYear;
    private String modelName;

    public Car(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}