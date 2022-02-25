package com.designpatterns.structural.decorator;

public class TableTwo implements  Table{
    @Override
    public void render() {
        System.out.println("Picture : Table Two");
    }
}
