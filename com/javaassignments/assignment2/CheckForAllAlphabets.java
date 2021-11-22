package com.javaassignments.assignment2;

import java.util.Scanner;

public class CheckForAllAlphabets {
    public static void main(String[] args) {
       Scanner keyBoard = new Scanner(System.in);
        System.out.print("\nEnter your String ");
        String input =keyBoard.nextLine();
        if(PangramCheck.isPangram(input))
            System.out.println("String contain all alphabets");
        else if(input.length()!=26)
            System.out.println("String doesn't contain all alphabets");

    }
}
        
