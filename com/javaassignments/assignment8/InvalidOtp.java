package com.javaassignments.assignment8;

public class InvalidOtp extends Exception{
    public InvalidOtp(String errorMessage){
        super(errorMessage);
    }
}
