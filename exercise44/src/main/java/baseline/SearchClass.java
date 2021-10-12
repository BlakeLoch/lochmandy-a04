/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SearchClass {

  private static final Scanner input = new Scanner(System.in);

  public String getSearchStringFromUser() {
    // print "What is the product name? "
    System.out.print("What is the product name? ");
    // return user input
    return input.nextLine();
  }

  public Map<String, String> searchProductList(List<Map<String, String>> productList, String initialSearch) {
    Map<String, String> outMap = new HashMap<>();

    String searchString = initialSearch;

    //do
    do {

      // for each product
      for (Map<String, String> product : productList) {

        // if searchString matches product name
        if (product.get("name").equals(searchString)) {
          // outMap = product map
          outMap = product;
        }
      }

      // if outputMap is empty
      if (outMap.isEmpty()) {
        // print "Sorry, that product was not found in our inventory."
        System.out.println("Sorry, that product was not found in our inventory.");
        // get new searchString from user
        searchString = getSearchStringFromUser();
      }

      // while outMap is not empty/default
    } while(outMap.isEmpty());
    // return outMap
      return outMap;
  }
}
