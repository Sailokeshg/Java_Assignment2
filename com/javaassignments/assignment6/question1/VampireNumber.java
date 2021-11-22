package com.javaassignments.assignment6.question1;

import java.util.Arrays;
import java.util.HashSet;

public class VampireNumber {
    public static int numDigits(long num){
        return Long.toString(Math.abs(num)).length();
    }

    public static void main(String[] args) {
       PrintVampires.printVampireNumbers(100);
    }
}