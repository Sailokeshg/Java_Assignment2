package com.javaassignments.assignment7.questionfive;

public class SecondOuterClass extends FirstOuterClass {

    class SecondInnerClass extends FirstOuterClass.FirstInnerClass{
        SecondInnerClass(int valueTwo){
            System.out.println("Value in FirstInnerClass is "+valueTwo);
        }
    }
}
