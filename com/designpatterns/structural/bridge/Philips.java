package com.designpatterns.structural.bridge;

public class Philips extends TV{
    Remote remoteType;

    Philips(Remote remote) {
        super(remote);
        this.remoteType = remote;
    }

    @Override
    public void on() {
        System.out.println("Philips TV ON: ");
        remoteType.on();
    }

    @Override
   public void off() {
        System.out.println("Philips TV OFF: ");
        remoteType.off();
    }
}
