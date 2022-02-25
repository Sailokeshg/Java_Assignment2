package com.designpatterns.structural.composite;

public class SavingsAccount extends Account {
    private String accountNumber;
    private float accountBalance;

    public SavingsAccount(String accountNumber, float accountBalance) {
        super();
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }
}
