package com.javaassignments.assignment11;

public class MainClass {
    public static void main(String[] args) {
        String inputFilePath = "inputFile.txt";
        String outputFilePath = "outputFile.txt";
        CharOccurence occurrence = new CharOccurence();
        occurrence.saveToTextFile(inputFilePath,outputFilePath);
    }
}
