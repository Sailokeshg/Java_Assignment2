package com.designpatterns.creational.proxy;

public class Cash implements BankAccount{

    //This is the real class
    @Override
    public String withdraw(String amount) {
        return amount+"  has been withdrawn from BankAccount";
    }
}
