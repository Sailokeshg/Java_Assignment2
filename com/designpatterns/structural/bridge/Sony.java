package com.designpatterns.structural.bridge;

public class Sony extends TV{

    Remote remoteType;

    Sony(Remote remote){
        super(remote);
        this.remoteType = remote;
    }
    @Override
    public void  on() {
        System.out.println("Sony TV ON: ");
        remoteType.on();
    }
    @Override
    public void off() {
        System.out.println("Sony TV OFF: ");
        remoteType.off();
    }
}
