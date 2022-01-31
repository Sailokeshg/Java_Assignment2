package com.designpatterns.creational.builder;

public interface CarBuilder {

    public void buildBody();
    public void buildEngine();
    public void buildSeats();
    public void buildWindows();

    public Car getCar();
}
