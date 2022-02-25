package com.designpatterns.structural.decorator;

public class Client {
    public static void main(String[] args) {

        Table shadedTableOne = new TableShader(new TableOne());
        shadedTableOne.render();

        Table shadedTableTwo = new TableShader(new TableTwo());
        shadedTableTwo.render();
    }
}
