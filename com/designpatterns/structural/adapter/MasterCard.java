package com.designpatterns.structural.adapter;

public interface MasterCard {

    public String getCreditCardNumber();
    public String getCustomerName();
    public String getCardExpiryMonth();
    public String getCardExpiryYear();

    public void setCreditCardNumber(String creditCardNumber);
    public void setCustomerName(String customerName);
    public void setCardExpiryMonth(String expiryMonth);
    public void setCardExpiryYear(String expiryYear);
}
