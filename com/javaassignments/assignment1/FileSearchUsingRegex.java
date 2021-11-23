package com.javaassignments.assignment1;

import java.util.Scanner;

/***
 * This code helps us search the file name using its extension
 */
public class FileSearchUsingRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stop to exit");
        boolean searchNext = true;
        while (searchNext) {
            System.out.println("Enter extension to search :");
            String regexPattern = scanner.next();
            if ( regexPattern.equals("stop") )
                searchNext = false;
            else
                FileSearcher.searchFileDirectory(".", "^.*\\.(" + regexPattern + ")$");
        }
    }

}