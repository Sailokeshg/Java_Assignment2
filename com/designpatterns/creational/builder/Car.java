package com.designpatterns.creational.builder;

public class Car {

    private String body;
    private String engine;
    private String seats;
    private String windows;
    private String carType;

    public Car(String carType){
        this.carType=carType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body='" + body + '\'' +
                ", engine='" + engine + '\'' +
                ", seats='" + seats + '\'' +
                ", windows='" + windows + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
