package com.designpatterns.structural.adapter;

public interface Visa {

    public String getCustomerCardNumber();
    public String getCardOwnerName();
    public String getCardExpiryMonthDate();
    public String getCardExpiryYear();

    public void setCustomerCardNumber(String customerCardNumber);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpiryMonthDate(String cardExpiryMonthDate);
    public void setCardExpiryYear(String cardExpiryYear);

}
