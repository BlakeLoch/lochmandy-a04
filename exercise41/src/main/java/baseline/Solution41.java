/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution41 {

  public static void main(String[] args) {

    // Link helper classes
    FileInput fileIn = new FileInput();
    NameSorter sorter = new NameSorter();
    FileOutput fileOut = new FileOutput();

    // Import data from file
    List<String> names = new ArrayList<>(fileIn.readNames());

    // Sort list alphabetically
    sorter.sortNames(names);

    // Print output to file
    fileOut.writeNames(names);

  }

}
