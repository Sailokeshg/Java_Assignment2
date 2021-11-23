package com.javaassignments.assignment5.assignment.data;

public class SingletonDemo {
    String inputString;

    SingletonDemo(String string) {
        inputString = string;
    }

    /***
     *This is to show that non static variables are not accesible from static methods
     * @param string input static string
     * @return returns singleton class object
     */
    public static SingletonDemo singletonDemoMethod(String string) {
     //   inputString = string;  //Static methods can only access static variables.
        SingletonDemo singletonDemo = new SingletonDemo(string);
        return singletonDemo;
    }

    public void printInputString() {
        System.out.println("Input string is " + inputString);
    }
}
