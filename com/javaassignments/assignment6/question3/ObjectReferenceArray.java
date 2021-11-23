package com.javaassignments.assignment6.question3;

public class ObjectReferenceArray {
    /***
     * Constructor of this class to check reference object array calls.
     * @param string String passed as input for verification
     */
    public ObjectReferenceArray(String string){
        System.out.println(string);
    }

    public static void main(String[] args) {
        ObjectReferenceArray[] referenceArray = new ObjectReferenceArray[2];   //Constructor call doesn't print the string
        referenceArray[0] = new ObjectReferenceArray("String One");      //Now strings are printed
        referenceArray[1] = new ObjectReferenceArray("String Two");
    }
}

