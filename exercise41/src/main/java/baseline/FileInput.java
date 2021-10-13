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

  //read names into array list
  public List<String> readNames(String inputFile) {

    //Store Data
    List<String> names = new ArrayList<>();

    // open file
    File input = new File(inputFile);
    try (Scanner readFile = new Scanner(input)) {
      // loop through file
      while (readFile.hasNextLine()) {
        // store values in names
        names.add(readFile.nextLine());
      }
      // close file
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    return names;
  }

}
