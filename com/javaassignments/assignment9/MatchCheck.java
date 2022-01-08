package com.javaassignments.assignment9;
import java.util.regex.Pattern;

public class MatchCheck {
    /***
     * This method verifies that string matches with regex pattern rules
     * @param s1 String used for match verification
     * @return True or false after validation
     */
    public boolean isMatching(String stringTobeChecked) {
        String regexPattern = "[A-Z].*[.]";
        return Pattern.matches(regexPattern, stringTobeChecked);
    }
}
