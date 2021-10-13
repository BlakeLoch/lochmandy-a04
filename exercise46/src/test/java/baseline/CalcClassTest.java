/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 first_name last_name
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void countOccurrences() {

    CalcClass calc = new CalcClass();

    String test = """
        badger badger badger
        badger mushroom
        mushroom snake badger badger
        badger""";

    Map<String, Integer> expected = new HashMap<>();
    expected.put("badger", 7);
    expected.put("mushroom", 2);
    expected.put("snake", 1);

    Map<String, Integer> actual = calc.countOccurrences(test);

    assertEquals(expected, actual);

  }
}