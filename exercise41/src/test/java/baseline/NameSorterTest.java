/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class NameSorterTest {

  @Test
  void sortNames() {
    NameSorter sorter = new NameSorter();

    List<String> expected = new ArrayList<>();
    expected.add("Johnson, Jim");
    expected.add("Jones, Aaron");
    expected.add("Jones, Chris");
    expected.add("Ling, Mai");
    expected.add("Swift, Geoffrey");
    expected.add("Xiong, Fong");
    expected.add("Zarnecki, Sabrina");

    List<String> actual = new ArrayList<>();
    actual.add("Ling, Mai");
    actual.add("Johnson, Jim");
    actual.add("Zarnecki, Sabrina");
    actual.add("Jones, Chris");
    actual.add("Jones, Aaron");
    actual.add("Swift, Geoffrey");
    actual.add("Xiong, Fong");
    sorter.sortNames(actual);

    assertEquals(expected, actual);
  }
}