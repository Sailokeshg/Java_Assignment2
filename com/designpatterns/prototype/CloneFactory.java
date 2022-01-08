package com.designpatterns.prototype;

public class CloneFactory {


    // CloneFactory has no idea what these objects are
    // except that they are subclasses of Animal

    public Animal getClone(Animal animalSample) {

        // Because of Polymorphism the Sheep makeCopy()
        // is called here instead of Animals

        return animalSample.makeCopy();

    }

}
