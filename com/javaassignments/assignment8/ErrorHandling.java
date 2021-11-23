package com.javaassignments.assignment8;

public class ErrorHandling extends Exception {
    /***
     * This method throws Three custom exceptions
     * in case of condition fails
     * @param cvv Three-digit cvv number to be passed
     * @param otp  Four-digit otp number to be passed
     * @param cardNumber Sixteen-digit card number to be passed
     * @throws InvalidOtp
     * @throws InvalidCvv
     * @throws InvalidCardNumber
     */
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
