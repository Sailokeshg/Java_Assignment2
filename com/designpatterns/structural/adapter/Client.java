package com.designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        MasterCard masterCard = new MasterCardImplementation("1234567","lokesh","12","2024");
        Visa visa = new MasterCardToVisaAdapter(masterCard);
        payWithVisa(visa);
    }

    private static void payWithVisa(Visa visa) {
        System.out.println(visa.getCustomerCardNumber());
        System.out.println(visa.getCardOwnerName());
        System.out.println(visa.getCardExpiryMonthDate());
        System.out.println(visa.getCardExpiryYear());
    }
}