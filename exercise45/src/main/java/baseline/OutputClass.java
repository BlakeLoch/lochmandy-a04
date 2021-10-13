/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputClass {

  public void writeToFile(String outputFile, String outputString) {
    // create file data/'outputFile'
    try (FileWriter output = new FileWriter("data" + File.separator + outputFile)) {

      // write outputString to file
      output.write(outputString);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
