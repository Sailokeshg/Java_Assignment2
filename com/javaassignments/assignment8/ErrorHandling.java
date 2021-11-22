package com.javaassignments.assignment8;

public class ErrorHandling extends Exception {
    public void validateTransaction(String cvv, String otp, String cardNumber)
            throws InvalidOtp, InvalidCvv, InvalidCardNumber {
        if ( cvv.length() != 3 ) {
            throw new InvalidCvv("Invalid cvv number");
        }
        if ( otp.length() != 4 ) {
            throw new InvalidOtp("Invalid otp entered");
        }
        if ( cardNumber.length() != 16 ) {
            throw new InvalidCardNumber("Invalid card number entered");
        }
    }
}
