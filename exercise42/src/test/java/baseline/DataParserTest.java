/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class DataParserTest {

  @Test
  void parseData() {

    DataParser dataParser = new DataParser();

    List<String> expected = new ArrayList<>();
    expected.add("Ling      Mai       55900");
    expected.add("Johnson   Jim       56500");
    expected.add("Jones     Aaron     46000");
    expected.add("Jones     Chris     34500");
    expected.add("Swift     Geoffrey  14200");
    expected.add("Xiong     Fong      65000");
    expected.add("Zarnecki  Sabrina   51500");

    List<String> actualRaw = new ArrayList<>();
    actualRaw.add("Ling");
    actualRaw.add("Mai");
    actualRaw.add("55900");
    actualRaw.add("Johnson");
    actualRaw.add("Jim");
    actualRaw.add("56500");
    actualRaw.add("Jones");
    actualRaw.add("Aaron");
    actualRaw.add("46000");
    actualRaw.add("Jones");
    actualRaw.add("Chris");
    actualRaw.add("34500");
    actualRaw.add("Swift");
    actualRaw.add("Geoffrey");
    actualRaw.add("14200");
    actualRaw.add("Xiong");
    actualRaw.add("Fong");
    actualRaw.add("65000");
    actualRaw.add("Zarnecki");
    actualRaw.add("Sabrina");
    actualRaw.add("51500");

    List<String> actual = dataParser.parseData(actualRaw);

    assertEquals(expected, actual);
  }

}