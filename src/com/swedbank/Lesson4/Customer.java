package com.swedbank.Lesson4;

public class Customer {
    private int id;
    private String firstName;
    private String surname;
    private String personalCode;

    //    public Customer() {
//        firstName = "Vardenis";
//        surname = "pavardenis";
//        personalCode = "12345";
//    }

//    public Customer(String firstCustomerName, String lastCustomerName, String personalCustomerCode) {
//        firstName = firstCustomerName;
//        surname = lastCustomerName;
//        personalCode = personalCustomerCode;
//    }


    public Customer() {
    }

    public Customer(int id, String firstName, String surname, String personalCode) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.personalCode = personalCode;
    }
}
