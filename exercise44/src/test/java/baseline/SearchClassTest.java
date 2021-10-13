/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class SearchClassTest {

  @Test
  void searchProductListWidget() {

    SearchClass search = new SearchClass();

    Map<String, String> expected = new HashMap<>();
    expected.put("name", "Widget");
    expected.put("price", "25.00");
    expected.put("quantity", "5");

    List<Map<String, String>> productList = new ArrayList<>();

    Map<String, String> widget = new HashMap<>();
    widget.put("name", "Widget");
    widget.put("price", "25.00");
    widget.put("quantity", "5");

    Map<String, String> thing = new HashMap<>();
    thing.put("name", "Thing");
    thing.put("price", "15.00");
    thing.put("quantity", "5");

    Map<String, String> doodad = new HashMap<>();
    doodad.put("name", "Doodad");
    doodad.put("price", "5.00");
    doodad.put("quantity", "10");

    productList.add(widget);
    productList.add(thing);
    productList.add(doodad);

    Map<String, String> actual = new HashMap<>(search.searchProductList(productList, "Widget"));

    assertEquals(expected, actual);
  }

  @Test
  void searchProductListThing() {

    SearchClass search = new SearchClass();

    Map<String, String> expected = new HashMap<>();
    expected.put("name", "Thing");
    expected.put("price", "15.00");
    expected.put("quantity", "5");

    List<Map<String, String>> productList = new ArrayList<>();

    Map<String, String> widget = new HashMap<>();
    widget.put("name", "Widget");
    widget.put("price", "25.00");
    widget.put("quantity", "5");

    Map<String, String> thing = new HashMap<>();
    thing.put("name", "Thing");
    thing.put("price", "15.00");
    thing.put("quantity", "5");

    Map<String, String> doodad = new HashMap<>();
    doodad.put("name", "Doodad");
    doodad.put("price", "5.00");
    doodad.put("quantity", "10");

    productList.add(widget);
    productList.add(thing);
    productList.add(doodad);

    Map<String, String> actual = new HashMap<>(search.searchProductList(productList, "Thing"));

    assertEquals(expected, actual);
  }

}