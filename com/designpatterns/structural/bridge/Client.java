package com.designpatterns.structural.bridge;

public class Client {
    public static void main(String[] args) {

        TV sonyOldRemote = new Sony(new OldRemote());
        sonyOldRemote.on();
        sonyOldRemote.off();

        TV philipsNewRemote = new Philips(new NewRemote());
        philipsNewRemote.on();
        philipsNewRemote.off();
    }
}
