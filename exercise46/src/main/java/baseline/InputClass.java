/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputClass {

  public String readFile(String inputFile) {

    // read file as a string
    String data = "";
    try {
      data = Files.readString(Path.of("data" + File.separator + inputFile));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // return the string
    return data;

  }
}
