package com.innerclasses.insameclass.staticinnerclass;


class OuterClass
{
    static class InnerClassOne
    {
        //Class as a static member
    }

    class InnerClassTwo
    {
        //Class as a non-static member
    }
}

//Extending Static inner class or static nested class
class AnotherClassOne extends OuterClass.InnerClassOne
{
    //static nested class can be referred by outer class name,
}

//Extending non-static inner class or member inner class
class AnotherClassTwo extends OuterClass.InnerClassTwo
{
    public AnotherClassTwo()
    {
        new OuterClass().super();  //accessing super class constructor through OuterClass instance
    }
}
