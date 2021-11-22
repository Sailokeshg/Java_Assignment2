package com.javaassignments.assignment6.question1;

import java.util.Arrays;

public class DigitsValidation {
    public static boolean checkIfDigitsAreSame(long original, long factorOne, long factorTwo) {
        byte[] origBytes = Long.toString(original).getBytes();
        byte[] factBytes = (Long.toString(factorOne) + Long.toString(factorTwo)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(factBytes);
        return Arrays.equals(origBytes, factBytes);
    }
}
