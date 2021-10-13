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

class InputClassTest {

  @Test
  void importJson() {
    InputClass input = new InputClass();

    List<Map<String, String>> expected = new ArrayList<>();

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

    expected.add(widget);
    expected.add(thing);
    expected.add(doodad);

    List<Map<String, String>> actual = new ArrayList<>(
        input.importJson("data/exercise44_inputTest.json"));

    assertEquals(expected, actual);

  }
}