package com.designpatterns.creational.proxy;

public class CreditCard implements BankAccount {

    //This is the proxy class for Cash class
    BankAccount withdraw = new Cash();

    @Override
    public String withdraw(String amount) {
        System.out.print(withdraw.withdraw(amount));
        return null;

    }
}
