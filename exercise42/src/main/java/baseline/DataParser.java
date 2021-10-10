/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class DataParser {

  public List<String> parseData(List<String> rawData) {

    // store data in dataTable
    List<String> dataTable = new ArrayList<>();

    // Loop through rawData
    for (int i = 0; i < rawData.size() - 2; i += 3) {
      // add 'item 1 + tab + item 2 + tab + item 3' to dataTable
      dataTable.add(String.format("%-9s %-9s %s", rawData.get(i), rawData.get(i+1), rawData.get(i+2)));
    }

    // return dataTable
    return dataTable;
  }
}
