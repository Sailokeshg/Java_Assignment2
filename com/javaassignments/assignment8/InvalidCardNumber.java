package com.javaassignments.assignment8;

public class InvalidCardNumber extends Exception{
    public InvalidCardNumber(String errorMessage){
        super(errorMessage);
    }
}
