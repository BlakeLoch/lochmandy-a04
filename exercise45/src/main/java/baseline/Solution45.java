/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution45 {

  public static void main(String[] args) {

    //Link Helper classes
    InputClass input = new InputClass();
    CalcClass calc = new CalcClass();
    OutputClass output = new OutputClass();

    // Read data from file
    String data = input.readFile();

    // Replace "utilize" with "use"
    String outputString = calc.replaceUtilizeWithUse(data);

    // Ask for name of outputFile
    String outputFile = input.getOutputFileNameFromUser();

    // Write output to new file
    output.writeToFile(outputFile, outputString)

  }

}
