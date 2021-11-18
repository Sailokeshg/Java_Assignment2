package com.javaassignments.assignmenttwo;

import java.util.Scanner;

public class PangramCheck {
    public static boolean isPangram(String input) {
        boolean[] alphabetCheck = new boolean[ 26 ];
        int index = 0;
        int flag = 0;
        for ( int alphabetindex = 0 ; alphabetindex < input.length() ; alphabetindex++ ) {
            if ( input.charAt(alphabetindex) >= 'a' && input.charAt(alphabetindex) <= 'z' ) {
                index = input.charAt(alphabetindex) - 'a';
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