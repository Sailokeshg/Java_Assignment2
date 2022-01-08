package com.designpatterns.singleton;

public class Implementation {
    public static void main(String[] args) {
        MysqlConnection instance = MysqlConnection.getInstance();

        System.out.println(instance);

        MysqlConnection newInstance = MysqlConnection.getInstance();

        System.out.println(newInstance);
    }
}
