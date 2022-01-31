package com.designpatterns.structural.adapter;

public class MasterCardImplementation implements MasterCard{


    private String creditCardNumber;
    private String customerName;
    private String cardExpiryMonth;
    private String cardExpiryYear;

    @Override
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    @Override
    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    @Override
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber=creditCardNumber;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth=cardExpiryMonth;
    }

    @Override
    public void setCardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear =cardExpiryYear;
    }

    public MasterCardImplementation(String creditCardNumber, String customerName, String cardExpiryMonth, String cardExpiryYear) {
        this.creditCardNumber = creditCardNumber;
        this.customerName = customerName;
        this.cardExpiryMonth = cardExpiryMonth;
        this.cardExpiryYear = cardExpiryYear;
    }
}
