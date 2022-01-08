package com.designpatterns.factory;

public class MobileFactory {
    public Mobile orderMobile(String type) {

        if ( type.equals(Mobile.IPHONE) ) {
            return new IPhone(2, "A9", "A9 GPu");
        } else if ( type.equals(Mobile.ONEPLUS) ) {
            return new Oneplus(2, "ARM");
        } else if ( type.equals(Mobile.SAMSUNG) ) {
            return new Samsung("Intel");
        } else {
            return null;
        }
    }
}
