/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution44 {

  public static void main(String[] args) {

    //Link Helper classes
    InputClass input = new InputClass();
    SearchClass search = new SearchClass();
    OutputClass output = new OutputClass();

    // import data from json to list of maps
    List<Map<String, String>> productList = new ArrayList<>(input.importJson());

    // search product list
    Map<String, String> productInfo = new HashMap<String, String>(search.searchProductList(productList);

    // print productInfo
    output.print(productInfo);

  }

}
