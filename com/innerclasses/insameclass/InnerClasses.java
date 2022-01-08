package com.innerclasses.insameclass;

class OuterClass
{
    int x=2;

    void methodOfOuterClass()
    {
        System.out.println("From OuterClass");
    }

    //Class as a member
    class InnerClass
    {
        int y=5;
    }
}

class AnotherClass extends OuterClass
{
    //Only fields and methods are inherited.
    // To use inner class properties,
    //it's inner class must extend inner class of it's super class
    class AnotherInnerClass extends InnerClass
    {
        //Inner Class of AnotherClass extends Inner Class of OuterClass
    }
}

public class InnerClasses
{
    public static void main(String args[])
    {
        AnotherClass anotherClass = new AnotherClass();  //creating AnotherClass Object

        System.out.println(anotherClass.x);    //accessing inherited field x from OuterClass

        anotherClass.methodOfOuterClass();    //calling inherited method from OuterClass

        //Using the properties of InnerClass

        AnotherClass.AnotherInnerClass anotherInnerClass = anotherClass.new AnotherInnerClass();

        //creating object to AnotherInnerClass

        System.out.println(anotherInnerClass.y);  //accessing inherited field y from InnerClass

    }
}
