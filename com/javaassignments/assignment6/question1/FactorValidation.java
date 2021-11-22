package com.javaassignments.assignment6.question1;

public class FactorValidation {
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
