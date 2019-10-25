package com.swedbank.Lesson4;

public class AccountUtility {
    private static Account account;

    public static void closeAccount(Account account) {
        account.setAccountStatus(AccountStatus.CLOSED);
    }

    public AccountUtility() {
    }

    public static Account getAccount() {
        return account;
    }

    public static void setAccount(Account account) {
        AccountUtility.account = account;
    }
}
