package com.designpatterns.prototype;

public class TestCloning {

    public static void main(String[] args){


        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

       // Sheep clonedSheep = sally;
        // Creates a clone of Sally and stores it in its own
        // memory location
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        // These are exact copies of each other
        System.out.println(sally);

        System.out.println(clonedSheep);

        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));

        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }

}