package com.designpatterns.structural.composite;

public class Client {
    public static void main(String[] args) {
        CompositeAccount component = new CompositeAccount();

        component.addAccount(new CurrentAccount("CA01",10000));
        component.addAccount(new CurrentAccount("CA02",20000));
        component.addAccount(new SavingsAccount("SA01",30000));

        float totalBalance = component.getBalance();
        System.out.println("Total Balance: " + totalBalance);
    }
}
