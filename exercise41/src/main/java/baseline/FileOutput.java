/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOutput {

  //write names to output file
  public void writeNames(List<String> names) {

    //Select file
    String outputFile = "data/exercise41_output.txt";
    // open file
    try (FileWriter output = new FileWriter(outputFile)) {
      // write "Total of 'names'.length names"
      output.write("Total of " + names.size() + " names\n");
      // write "-----------------"
      output.write("-----------------\n");

      // add index to be able to check if the name is tha last one
      int i = 0;

      // loop through file
      for (String name : names) {
        // write name to file
        output.write(name);

        // If it is not the last name in the list, write a newline
        if (++i != names.size()) {
          output.write("\n");
        }
      }

      // close file
    } catch (IOException e) {
      e.printStackTrace();
    }

  }


}
