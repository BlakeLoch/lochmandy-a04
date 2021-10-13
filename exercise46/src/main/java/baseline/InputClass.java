/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 first_name last_name
 */

package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputClass {

  public String readFile() {

    // read file as a string
    String data = "";
    try {
      data =  Files.readString(Path.of("data/exercise46_input.txt"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // return the string
    return data;

  }
}