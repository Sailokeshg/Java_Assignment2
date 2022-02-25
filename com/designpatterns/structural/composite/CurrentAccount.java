package com.designpatterns.structural.composite;

public class CurrentAccount extends Account {
    private String accountNumber;
    private float accountBalance;

    public CurrentAccount(String accountNumber, float accountBalance) {
        super();
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
