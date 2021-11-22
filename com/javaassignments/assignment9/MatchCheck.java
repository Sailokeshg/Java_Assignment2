package com.javaassignments.assignmentnine;


import java.util.regex.Pattern;

public class MatchCheck {
    public boolean isMatching(String s1) {
        String regexPattern = "[A-Z].*[.]";
        return Pattern.matches(regexPattern, s1);
    }
}
