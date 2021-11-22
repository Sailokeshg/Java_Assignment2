package com.javaassignments.assignmentnine;
import java.util.Scanner;


public class PatternMatcher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the string: ");
       String string = in.nextLine();
        MatchCheck matchCheck = new MatchCheck();
        if(matchCheck.isMatching(string)){
            System.out.println("Yes the given pattern matches the regex:");
        }
        else {
            System.out.println("No the given pattern doesnot match the regex:");
        }

    }
}
