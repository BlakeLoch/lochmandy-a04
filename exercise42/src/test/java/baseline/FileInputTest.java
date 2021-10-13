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
  void readData() {

    FileInput fileIn = new FileInput();

    List<String> expected = new ArrayList<>();
    expected.add("Ling");
    expected.add("Mai");
    expected.add("55900");
    expected.add("Johnson");
    expected.add("Jim");
    expected.add("56500");
    expected.add("Jones");
    expected.add("Aaron");
    expected.add("46000");
    expected.add("Jones");
    expected.add("Chris");
    expected.add("34500");
    expected.add("Swift");
    expected.add("Geoffrey");
    expected.add("14200");
    expected.add("Xiong");
    expected.add("Fong");
    expected.add("65000");
    expected.add("Zarnecki");
    expected.add("Sabrina");
    expected.add("51500");

    List<String> actual = new ArrayList<>(fileIn.readData("data/exercise42_inputTest.txt"));

    assertEquals(expected, actual);

  }
}