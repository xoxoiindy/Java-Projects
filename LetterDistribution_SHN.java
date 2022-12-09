/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Sung Nam
 * Description: Prg02 - LetterDistribution
 * Student(s) Name(s):
 */

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class LetterDistribution_SHN {

    static final String LETTERS_IN_THE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final char   FIRST_LETTER            = 'a';
    static final String FILE_NAME               = "Constitution.txt";
    static final int    FRAME_WIDTH             = 1024;
    static final int    FRAME_HEIGHT            = 768;

    public static void main(String[] args) throws FileNotFoundException {
        //ToDo: Define two arrarys whose size is the English alphabet length
        
        
        
        //ToDo: Initialize both arrays with the default values




        
        // ToDo: Set up to read a file using Scanner.  
        // It reads from a file, instead of reading from System.in (keyboard)
        
        
        
        /* 
         * ToDo: 
         *
         * While reading the file line by line.
         *    New function to learn:  hasNext(), nextLine(), toLowerCase()
         *    for the new line just read in, inspect each character
         *        if it is a valid letter, increment the frequency of the character and total number variables
         * end the while-loop
         * Compute percentage for each character 
         * Display the chart using the code from BarChart.java::main()
         *    make sure you call BarChart constructor with the correspondign actual arguments
         */
         
         
         
         
         
         
         
         
         
         
         
        //Below is the code from BarChart.java 
        JFrame f = new JFrame();
        f.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        String title = FILE_NAME.split("\\.")[0];

        //ToDo: Replace <arg1>, <arg2>, and ,arg3> with your own arrays from the code above
        f.getContentPane().add(new BarChart(<arg1>, <arg2>, <arg3>));

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        f.addWindowListener(wndCloser);
        f.setVisible(true);
    }
}