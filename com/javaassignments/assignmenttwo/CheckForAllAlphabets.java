package com.javaassignments.assignmenttwo;

import java.util.Scanner;

public class CheckForAllAlphabets {
    public static void main(String[] args) {
       Scanner keyBoard = new Scanner(System.in);
        System.out.print("\nEnter your String ");
        String input =keyBoard.nextLine();
        if(PangramCheck.isPangram(input))
            System.out.println("String contain all alphabets");
        else
            System.out.println("String doesn't contain all alphabets");

    }
}
        
