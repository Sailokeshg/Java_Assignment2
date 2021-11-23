package com.javaassignments.assignment6.question1;

public class FactorValidation {
    /***
     * This method checks if both factors end with Zero's which is invalid for vampire number
     * also check if number of digits in both factors are same and are half of original number and even.
     * @param original The number which is to be factorised
     * @param factorOne  First factor of original number
     * @param factorTwo  Second factor of original number
     * @return false if  both factors end with Zero's and
     * number of digits in both factors are half of original number and even
     */
    public static boolean validFactors(long original, long factorOne, long factorTwo){
        // If both numbers ends with '0' there are invalid
        if(Long.toString(factorOne).endsWith("0") && Long.toString(factorTwo).endsWith("0"))
            return false;

        // check no of digits
        int totDigits = VampireNumber.numDigits(original);
        if(VampireNumber.numDigits(factorOne) != totDigits/2 || VampireNumber.numDigits(factorTwo) != totDigits/2)
            return false;

        // check the digits
        return DigitsValidation.checkIfDigitsAreSame(original, factorOne, factorTwo);
    }
}
