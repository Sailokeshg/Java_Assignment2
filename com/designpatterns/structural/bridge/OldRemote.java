package com.designpatterns.structural.bridge;

public class OldRemote extends Remote{
    @Override
    public void on() {
        System.out.println("On with Old Remote");
    }

    @Override
    public void off() {
        System.out.println("Off with Old Remote");
    }
}
