package com.javaassignments.assignment7.questionthree;

public class MainClass {
    public static void one(Ione one){
        one.methodOne1();
        one.methodOne2();
    }
    public static void two(ITwo two){
        two.methodTwo1();
        two.methodTwo2();
    }
    public static void three(IThree three){
        three.methodThree1();
        three.methodThree2();
    }
    public static void four(NewInterface newInterface){
        newInterface.newInterfaceMethod();
    }

    public static void main(String[] args) {
        NewClass newClass = new NewClass();
        one(newClass);
        two(newClass);
        three(newClass);
        four(newClass);
    }

}
