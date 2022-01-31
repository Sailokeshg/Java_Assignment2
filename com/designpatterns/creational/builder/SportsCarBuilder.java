package com.designpatterns.creational.builder;

public class SportsCarBuilder implements CarBuilder {

    Car car = new Car("Sports");

    @Override
    public void buildBody() {
          car.setBody("Length :16 feet,"+"Width :5 feer");
    }

    @Override
    public void buildEngine() {
              car.setEngine("4000hp with 8000 rpm");
    }

    @Override
    public void buildSeats() {
          car.setSeats("2 seater");
    }

    @Override
    public void buildWindows() {
            car.setWindows("Extra toughened glasses");
    }

    @Override
    public Car getCar() {
        return car;
    }


}
