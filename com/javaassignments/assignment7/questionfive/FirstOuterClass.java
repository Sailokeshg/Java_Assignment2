package com.javaassignments.assignment7.questionfive;

public class FirstOuterClass {
    FirstOuterClass(){
        System.out.println("First outer class constructor is running");
    }
    class FirstInnerClass{

        FirstInnerClass(int valueOne){
            System.out.println("Value in FirstInnerClass is "+valueOne);
        }
    }
}
