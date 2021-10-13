/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class FileInputTest {

  @Test
  void readNames() {

    FileInput fileIn = new FileInput();

    List<String> expected = new ArrayList<>();
    expected.add("Ling, Mai");
    expected.add("Johnson, Jim");
    expected.add("Zarnecki, Sabrina");
    expected.add("Jones, Chris");
    expected.add("Jones, Aaron");
    expected.add("Swift, Geoffrey");
    expected.add("Xiong, Fong");

    List<String> actual = new ArrayList<>(fileIn.readNames("data/exercise41_inputTest.txt"));

    assertEquals(expected, actual);
  }

}