package com.designpatterns.creational.singleton;

public class MysqlConnection {

    private static MysqlConnection instance;

   //private static MysqlConnection instance = new MysqlConnection();

    private MysqlConnection() {}

    public static MysqlConnection getInstance() {
        if ( instance == null ) {
            instance = new MysqlConnection();
        }
        return instance;
    }
}
