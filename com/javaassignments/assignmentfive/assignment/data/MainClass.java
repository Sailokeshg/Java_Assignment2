package com.javaassignments.assignmentfive.assignment.data;

public class MainClass {
    public static void main(String[] args) {
        DefaultInitialization classA = new DefaultInitialization();
        classA.printMemberVariables();
        classA.printLocalVariables();

        SingletonDemo singletonDemo = new SingletonDemo("string for validation");
        singletonDemo.singletonDemoMethod("string for validation");
        singletonDemo.printInputString();
    }
}
