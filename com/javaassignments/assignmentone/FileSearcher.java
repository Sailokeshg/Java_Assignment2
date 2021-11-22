package com.javaassignments.assignmentone;

import java.io.File;
import java.util.regex.Pattern;

public class FileSearcher {
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
