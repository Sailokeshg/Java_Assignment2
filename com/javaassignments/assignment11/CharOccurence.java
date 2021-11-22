package com.javaassignments.assignment11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurence {
    public void saveToTextFile(String inputFile,String outputFile){
        try{
            Scanner input = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFile);
            Map<Character,Integer> characterIntegerMap = new HashMap<>();
            while (input.hasNext()){
                char[] characters =input.next().toCharArray();
                for(char character:characters){
                    characterIntegerMap.put(character,characterIntegerMap.getOrDefault(character,0)+1);
                }
            }
            for(Map.Entry<Character,Integer> entry :characterIntegerMap.entrySet()){
                writer.println("Occurrence of "+entry.getKey()+" is "+entry.getValue());
            }
            input.close();
            writer.close();
        }
        catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
    }
}
