package com.javaassignments.assignment6.question2;

public class ConstructorOverloading {
    int varOne;
    int varTwo;

    /***
     * This shows that constructor overloading is possible
     * @param varOne first variable of two parametered costructor
     * @param varTwo second variable of two parametered costructor
     */
    public ConstructorOverloading(int varOne, int varTwo){
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
