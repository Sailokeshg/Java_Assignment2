package com.javaassignments.assignment2;

public class PangramCheck {
    public static boolean isPangram(String input) {
        boolean[] alphabetCheck = new boolean[ 26 ];
        int index = 0;
        for ( int alphabetIndex = 0 ; alphabetIndex < input.length() ; alphabetIndex++ ) {
            if ( input.charAt(alphabetIndex) >= 'a' && input.charAt(alphabetIndex) <= 'z' ) {
                index = input.charAt(alphabetIndex) - 'a';
                alphabetCheck[ index ] = true;
            }
        }
        for(boolean alphabets:alphabetCheck){
            if(!alphabets)
                return false;
        }
        return true;
    }
}