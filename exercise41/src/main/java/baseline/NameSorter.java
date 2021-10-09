/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Comparator;
import java.util.List;

public class NameSorter {

  //sort names
  public void sortNames(List<String> names) {
    // Compare last names
    Comparator<String> compare = Comparator.comparing(String::toUpperCase);
    // Sort alphabetically
    names.sort(compare);
  }


}
