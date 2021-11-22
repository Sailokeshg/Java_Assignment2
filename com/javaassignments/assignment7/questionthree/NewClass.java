package com.javaassignments.assignment7.questionthree;

public class NewClass extends Concrete implements NewInterface{

    @Override
    public void methodThree1() {
        System.out.println("in method methodThree1");
    }

    @Override
    public void methodThree2() {
        System.out.println("in method methodThree2");
    }

    @Override
    public void methodTwo1() {
        System.out.println("in method methodTwo1");

    }

    @Override
    public void methodTwo2() {
        System.out.println("in method methodTwo2");
    }

    @Override
    public void methodOne1() {
        System.out.println("in method methodOne1");
    }


    @Override
    public void methodOne2() {
        System.out.println("in method methodOne2");
    }

    @Override
    public void newInterfaceMethod() {
        System.out.println("in method new interface");
    }
}
