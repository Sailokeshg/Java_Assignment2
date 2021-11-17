package com.javaassignments;

import java.util.Scanner;

public class CheckForAllAlphabets {
    public static void main(String[] args) {
        String input;
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("\nEnter your String ");
        input = keyBoard.nextLine();
        input = input.toLowerCase();
        boolean[] alphabetCheck = new boolean[ 26 ];
        int index = 0;
        int flag = 1;
        for ( int alphabetindex = 0 ; alphabetindex < input.length() ; alphabetindex++ ) {
            if ( input.charAt(alphabetindex) >= 'a' && input.charAt(alphabetindex) <= 'z' ) {
                index = input.charAt(alphabetindex) - 'a';
            }
            alphabetCheck[ index ] = true;
        }
        for ( int alphabet = 0 ; alphabet <= 25 ; alphabet++ ) {
            if ( alphabetCheck[ alphabet ] == false ) {
                flag = 0;
            }
        }
        System.out.print("String: " + input);
        if ( flag == 1 )
            System.out.print("\nThe above string is a pangram.\n ");
        else
            System.out.print("\nThe above string is not a pangram.\n ");
    }
}
        
