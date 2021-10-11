/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public String getSiteNameFromUser() {
    // prompt for site name
    System.out.print("Site name: ");
    // return user input
    return input.nextLine();
  }

  public String getAuthorFromUser() {
    // prompt for author
    System.out.print("Author: ");
    // return user input
    return input.nextLine();
  }

  public Boolean askIfJavaScriptFolder() {
    // prompt if user wants JS folder
    System.out.print("Do you want a folder for JavaScript? ");
    // return user input
    return getYesOrNo();
  }

  public Boolean askIfCssFolder() {
    // prompt if user wants JS folder
    System.out.print("Do you want a folder for CSS? ");
    // return user input
    return getYesOrNo();
  }

  private Boolean getYesOrNo() {
    // Get user input
    String userInput = input.nextLine();
    // loop to restrict input to y or n
    while (!userInput.equalsIgnoreCase("Y") && !userInput.equalsIgnoreCase("N")) {
      System.out.println("Please enter Y or N.");
      userInput = input.nextLine();
    }
    return userInput.equalsIgnoreCase("Y");
  }

}
