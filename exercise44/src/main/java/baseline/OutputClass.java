/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Map;

public class OutputClass {

  public void print(Map<String, String> productInfo) {
    // print "Name = "+product name
    System.out.println(productInfo.get("name"));
    // print "Price = "+product price
    System.out.println(productInfo.get("price"));
    // print "Quantity = "+product quantity
    System.out.println(productInfo.get("quantity"));
  }

}
