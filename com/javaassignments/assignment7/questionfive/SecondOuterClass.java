package com.javaassignments.assignment7.questionfive;

public class SecondOuterClass extends FirstOuterClass {
    //Only fields and methods are inherited.
    // To use inner class properties,
    //it's inner class must extend inner class of it's super class
    class SecondInnerClass extends FirstInnerClass{
        SecondInnerClass(int valueTwo){
            super(5);
            System.out.println("Value in FirstInnerClass is "+valueTwo);
        }
    }
}
