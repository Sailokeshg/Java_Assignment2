package com.javaassignments.assignmentseven.questionone;

public class MainClass {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0]=new Mouse();
        rodent[0].show();
        rodent[0].game();
        rodent[1]= new Gerbil();
        rodent[1].game();
        rodent[2]= new Hamster();
        rodent[2].show();
    }
}
