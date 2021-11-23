package com.javaassignments.assignment6.question1;

import java.util.HashSet;

public class PrintVampires {
    /***
     * This method prints N  vampire numbers where N is passed as argument
     * @param totNum  Number of vampire numbers to be printed
     */
    public static void printVampireNumbers(int totNum){
        HashSet<Long> vampNums = new HashSet<>();
        for(long i=10; vampNums.size() <=totNum; i++){
            if(VampireNumber.numDigits(i) % 2 !=0){
                i = i*10 -1;
                continue;
            }
            for(long factorOne=2; factorOne<= Math.sqrt(i) +1; factorOne++){
                if(i % factorOne == 0){
                    long factorTwo = i /factorOne;
                    if(FactorValidation.validFactors(i,factorOne,factorTwo) && factorOne <= factorTwo){
                        vampNums.add(i);
                        System.out.println("Vampire number: " + i + " with factors: [" + factorOne + ", " + factorTwo +"]");
                    }
                }
            }
        }
    }
}
