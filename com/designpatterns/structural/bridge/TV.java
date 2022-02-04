package com.designpatterns.structural.bridge;

abstract class TV {

    Remote remote;
    TV(Remote remote) {
        super();
        this.remote = remote;
    }

    public abstract void on();
    public abstract  void off();
}
