package com.javaassignments.assignmentthree;
import java.util.Scanner;

public class PingDemo {

    public static void main(String[] args) {

        String hostname;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the host address : ");
        hostname =in.nextLine();
        PingTheHost.hostCheck("ping " + hostname);

    }
}
