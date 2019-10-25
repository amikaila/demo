package com.swedbank.Lesson4;

public class CustomersApplication {
    public static void main(String[] args) {
        final double SEK_EXCHANGE_RATE = 15.73567212;
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
        double ret = account.getAccountBalanceFromEurToSek(SEK_EXCHANGE_RATE);
        System.out.println("balance = " + ret);
    }
}
