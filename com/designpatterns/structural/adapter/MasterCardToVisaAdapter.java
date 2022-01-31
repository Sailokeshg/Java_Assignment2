package com.designpatterns.structural.adapter;

public class MasterCardToVisaAdapter implements Visa{

    private String customerCardNumber;
    private String cardOwnerName;
    private String cardExpiryMonthDate;
    private String cardExpiryYear;

    private final MasterCard masterCard;

    public MasterCardToVisaAdapter(MasterCard masterCard) {
        this.masterCard = masterCard;
        setProperties();
    }

    private void setProperties(){
          setCustomerCardNumber(this.masterCard.getCreditCardNumber());
          setCardOwnerName(this.masterCard.getCustomerName());
          setCardExpiryMonthDate(this.masterCard.getCardExpiryMonth());
          setCardExpiryYear(this.masterCard.getCardExpiryYear());
    }

    @Override
    public String getCustomerCardNumber() {
        return customerCardNumber;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpiryMonthDate() {
        return cardExpiryMonthDate;
    }

    @Override
    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    @Override
    public void setCustomerCardNumber(String customerCardNumber) {
        this.customerCardNumber=customerCardNumber;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName=cardOwnerName;
    }

    @Override
    public void setCardExpiryMonthDate(String cardExpiryMonthDate) {
        this.cardExpiryMonthDate=cardExpiryMonthDate;
    }

    @Override
    public void setCardExpiryYear(String cardExpiryYear) {
         this.cardExpiryYear=cardExpiryYear;
    }
}
