/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 first_name last_name
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution46 {

  public static void main(String[] args) {

    //Link Helper classes
    InputClass input = new InputClass();
    CalcClass calc = new CalcClass();
    OutputClass output = new OutputClass();

    // Read input from file
    String data = input.readFile();

    // Count occurrences of each word
    List<Map<String, Integer>> frequencies = new ArrayList<Map<String, Integer>>(calc.countOccurrences(data));

    // Print histogram in descending order
    output.printHistogram(frequencies);

  }

}
