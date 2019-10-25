package com.swedbank.Lesson4;

public class Account {
    public int id;
    public String accountNumber;
    public double balance;
    public String currency;
    public AccountType accountType;
    public AccountStatus accountStatus;

    public Account() {
    }

    public Account(int id, String accountNumber, double balance, String currency, AccountType accountType) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
        this.accountType = accountType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalanceFromEurToSek(double exchangeRate) {
        if (currency.equals("EUR")) {
            balance = balance * exchangeRate;
            System.out.println(balance = balance * exchangeRate);
        } else {
            System.out.println("Invalid currency");
        }
        return balance;
    }

    public double increaseAccountBalance(int increaseAmount) {
        return balance = balance + increaseAmount;
    }

    public double increaseAccountBalance(double increaseAmount) {
        return balance = balance + increaseAmount;
    }

    public double increaseAccountBalance(String increaseAmount) {
        return balance = balance + Double.parseDouble(increaseAmount);
    }

    //    public Account() {
//    }
//
//    public Account(int id, String accountNumber, AccountType accountType) {
//        this.id = id;
//        this.accountNumber = accountNumber;
//        this.accountType = accountType;
//    }
//
//    public AccountType getAccountType() {
//        return accountType;
//    }
//
//    public void setAccountType(AccountType accountType) {
//        this.accountType = accountType;
//    }
}
