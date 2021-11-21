package com.javaassignments.assignmentthree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PingTheHost {
    public static void hostCheck(String command) {

        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String string = "";
            while ((string = inputStream.readLine()) != null) {
                System.out.println(string);
                process.destroy();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
