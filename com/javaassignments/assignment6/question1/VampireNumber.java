package com.javaassignments.assignment6.question1;


public class VampireNumber {
    /***
     * This method counts nummber of digits in passed number
     * @param num Number which is checked for number of digits present in it
     * @return Number of digits present in number passed
     */
    public static int numDigits(long num){
        return Long.toString(Math.abs(num)).length();
    }

    public static void main(String[] args) {
       PrintVampires.printVampireNumbers(100);
    }
}