package com.swedbank.Lesson4;

public class CustomersApplication {
    public static void main(String[] args) {
//        String firstCustomerName = "Vardas";
//        String lastCustomerName = "Pavarde";
//        String personalCustomerCode = "12345";

//        Customer customer = new Customer(firstCustomerName, lastCustomerName, personalCustomerCode);
//        System.out.println(customer.firstName + customer.surname);
        Account account = new Account();
        account.setId(123);
        account.setAccountNumber("LT12123414214321");
        account.setBalance(345.45);
        account.setCurrency("EUR");
        account.setAccountType(AccountType.PRIVATE);
        account.getAccountBalanceFromEurToSek();
    }
}
