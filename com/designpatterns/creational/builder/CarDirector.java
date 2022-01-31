package com.designpatterns.creational.builder;


public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder=carBuilder;
    }

    public void makeCar(){
        this.carBuilder.buildBody();
        this.carBuilder.buildEngine();
        this.carBuilder.buildSeats();
        this.carBuilder.buildWindows();
    }

    public Car getCar(){
        return this.carBuilder.getCar();
    }
}
