package com.javaassignments.assignment6.question1;

import java.util.Arrays;

public class DigitsValidation {
    /***
     * This method checks if number of digits in both factors are same and each repeated same number of times
     * @param original  Nmumber which is factorised
     * @param factorOne First factor of original number
     * @param factorTwo Second factor of original number
     * @return  true if both factors have same number of digits which are repeated for same number of times,else false
     */
    public static boolean checkIfDigitsAreSame(long original, long factorOne, long factorTwo) {
        byte[] origBytes = Long.toString(original).getBytes();
        byte[] factBytes = (Long.toString(factorOne) + Long.toString(factorTwo)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(factBytes);
        return Arrays.equals(origBytes, factBytes);
    }
}
