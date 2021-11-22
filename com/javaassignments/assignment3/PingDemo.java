package com.javaassignments.assignment3;
import java.io.IOException;
import java.util.Scanner;

public class PingDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, number of step to be executed :");
        int numberOfSteps = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter URI or IP address");
        String host = scanner.nextLine();
        try {
            PingTheHost.hostPing(numberOfSteps, host);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

