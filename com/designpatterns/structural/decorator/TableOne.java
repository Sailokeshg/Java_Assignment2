package com.designpatterns.structural.decorator;

public class TableOne implements Table{
    @Override
    public void render() {
        System.out.println("Picture:Table One");
    }
}
