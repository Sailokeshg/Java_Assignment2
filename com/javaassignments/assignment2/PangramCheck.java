package com.javaassignments.assignment2;

public class PangramCheck {
    /***
     * This method checks whether the input string contains
     * alphabets or not.
     * @param input String which is checked for all alphabets.
     * @return true if it contains all alphabtes,false if not.
     */
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