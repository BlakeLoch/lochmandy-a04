/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution41 {

  public static void main(String[] args) {

    // Link helper classes
    FileInput fileIn = new FileInput();
    NameSorter sorter = new NameSorter();
    FileOutput fileOut = new FileOutput();

    // Import data from file
    fileIn.getNames();

    // Sort list alphabetically
    sorter.setNames();

    // Print output to file
    fileOut.writeNames();

  }

}
