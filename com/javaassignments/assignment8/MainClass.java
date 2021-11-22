package com.javaassignments.assignment8;

public class MainClass {
    public static void main(String[] args) {
        try {
            ErrorHandling errorHandler = new ErrorHandling();
            errorHandler.validateTransaction("234", "2425", "0123456789012345");
        }
        catch (InvalidCardNumber | InvalidCvv | InvalidOtp ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
