/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public String readFile(String inputFile) {
    // read file as a string
    String data = "";
    try {
      data =  Files.readString(Path.of("data/"+inputFile));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // return the string
   return data;
  }

  public String getOutputFileNameFromUser() {
    // prompt the user for output file name
    System.out.print("Where should the output be written? ");
    // return user input
    return input.nextLine();
  }

}
