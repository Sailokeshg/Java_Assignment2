package com.designpatterns.creational.builder;

public class Client {

    public static void main(String[] args) {
        CarBuilder carBuilder = new SedanCarBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        carDirector.makeCar();
        System.out.println(carBuilder.getCar());

    }
}
