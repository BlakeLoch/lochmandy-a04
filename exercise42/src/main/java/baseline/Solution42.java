/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution42 {

  public static void main(String[] args) {

    // Link helper classes
    FileInput fileIn = new FileInput();
    DataParser dataParser = new DataParser();
    FileOutput fileOut = new FileOutput();

    // Import data from file
    List<String> rawData = new ArrayList<>(fileIn.readData());

    // Parse data into a table
    List<String> dataTable = dataParser.parseData(rawData);

    // Print output to file
    fileOut.writeTable(dataTable);

  }

}
