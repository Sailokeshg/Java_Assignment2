package com.javaassignments.assignmentseven.questionfive;

public class FirstOuterClass {
    FirstOuterClass(){
        System.out.println("First outer class constructor is running");
    }
    class FirstInnerClass{
        FirstInnerClass(){
           // With out This default constructor inheritance of this class by other inner class is not possible.
        }
        FirstInnerClass(int valueOne){
            System.out.println("Value in FirstInnerClass is "+valueOne);
        }
    }
}
