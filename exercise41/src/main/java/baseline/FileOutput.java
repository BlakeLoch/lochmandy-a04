/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class FileOutput {

  //Link Class
  public static NameSorter sorter = new NameSorter();

  //Select File
  String outputFile = "exercise41_output.txt";
  //Store Data
  List<String> names = new ArrayList<>();

  //open file
  private void openFile() {
    // create file with name outputFile
    // open file with name outputFile
  }

  //close file
  private void closeFile() {
    // close file with name outputFile
  }

  //read names into array list
  public void writeNames() {
    // open file
    // write "Total of 'names'.length names"
    // write "-----------------"
    // loop through file
    // store values in names
    // close file
  }

  //set names with info from NameSorter
  public void setNames() {
    // set names list to match the list from NameSorter
    // for each name in names
    // add the name to this names list
  }

}
