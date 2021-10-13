/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput {

  // read data into array list
  public List<String> readData(String inputFile) {

    // Store Data
    List<String> rawData = new ArrayList<>();

    // open file
    File input = new File(inputFile);
    try (Scanner readFile = new Scanner(input)) {

    // set delimiter to comma
      readFile.useDelimiter("[,\\n]");

    // loop through file
      while (readFile.hasNext()) {

        // store values in rawData
        rawData.add(readFile.next());
      }

    // close file
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    // return rawData
    return rawData;
  }
}
