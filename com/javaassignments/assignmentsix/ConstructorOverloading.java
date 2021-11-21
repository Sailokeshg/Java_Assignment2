package com.javaassignments.assignmentsix;

public class ConstructorOverloading {
    int varOne;
    int varTwo;
    public ConstructorOverloading(int varOne,int varTwo){
        this(5);
        System.out.println("first Constructor is running");
    }
    public ConstructorOverloading(int varOne){
        this.varOne=varOne;
        System.out.println("Second Constructor is running");
    }

    public static void main(String[] args) {
        ConstructorOverloading overLoadingObject = new ConstructorOverloading(5);
    }
}
