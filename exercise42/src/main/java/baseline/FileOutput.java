/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOutput {

  //write table to output file
  public void writeTable(List<String> dataTable, String outputFile) {

    // open file
    try (FileWriter output = new FileWriter(outputFile)) {
      // write "Last      First     Salary"
      output.write("Last      First     Salary\n");
      // write "--------------------------"
      output.write("--------------------------\n");

      // add index to be able to check if the name is tha last one
      int i = 0;

      // loop through file
      for (String row : dataTable) {
        // write row to file
        output.write(row);

        // If it is not the last row in the list, write a newline
        if (++i != dataTable.size()) {
          output.write("\n");
        }
      }

      // close file
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
