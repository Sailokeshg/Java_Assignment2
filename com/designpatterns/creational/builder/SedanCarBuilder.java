package com.designpatterns.creational.builder;

public class SedanCarBuilder  implements CarBuilder{

    Car car = new Car("Sedan");

    @Override
    public void buildBody() {
        car.setBody("Length :14.8 feet ,"+"Width :5 feet");
    }

    @Override
    public void buildEngine() {
         car.setEngine("2280hp power with 5000 rpm");
    }

    @Override
    public void buildSeats() {
       car.setSeats("4 seater");
    }

    @Override
    public void buildWindows() {
     car.setWindows("Laminated front and rear glass");
    }

    @Override
    public Car getCar() {
        return car;
    }

}
