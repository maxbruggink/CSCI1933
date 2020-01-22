// TextScan.java
// Opens text file supplied on the command line
// Usage:  java TextScan filename
// Counts all tokens found (a token is anything delimited by a space character)
// Displays each token found to the screen
// Code may be used in part for Project 5 with proper citing.

import java.util.Scanner;
import java.io.*;

public class TextScan {

public static void main(String[] args) {
        HashMap hashTest = new HashMap(266);
        //  System.out.println(hashTest.containsKey("you"));
        Scanner readFile = null;
        String s;
        int count = 0;

        System.out.println();
        System.out.println("Attempting to read from file: " + "canterbury.txt");
        try {
                readFile = new Scanner(new File("gettysburg.txt"));
        }
        catch (FileNotFoundException e) {
                System.out.println("File: " + "canterbury.txt" + " not found");
                System.exit(1);
        }

        System.out.println("Connection to file: " + "canterbury.txt" + " successful");
        System.out.println();
        while(readFile.hasNext()) {
                s = readFile.next();
                hashTest.put(s,s);
                //      System.out.println("Token found: " + s);
                count++;
        }
        hashTest.display();
        System.out.println(hashTest.containsKey("that"));
          
        System.out.println(count + " Tokens found");
        //  System.out.println();

}      // main

}  // TextScan
