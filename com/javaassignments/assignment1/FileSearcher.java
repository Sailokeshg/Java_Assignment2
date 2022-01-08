package com.javaassignments.assignment1;

import java.io.File;
import java.util.regex.Pattern;


public class FileSearcher {
    /***
     * This method helps us to search for the file in  passed path
     * @param path  Location where search needs to be done
     * @param regexPattern  Pattern to which file name is checked for matching
     */
    public static void searchFileDirectory(String path, String regexPattern) {
        File root = new File(path);
        File[] filesList = root.listFiles();
        if ( filesList == null ) return;
        for ( File file : filesList ) {
            if ( file.isDirectory() ) {
                searchFileDirectory(file.getAbsolutePath(), regexPattern);
                System.out.println( "Dir:" + file.getAbsoluteFile() );
            } else {
                boolean isMatch = Pattern.matches(regexPattern, "" + file.getAbsoluteFile());
                if ( isMatch)
                    System.out.println("File:" + file.getAbsoluteFile());
            }
        }
    }
}
