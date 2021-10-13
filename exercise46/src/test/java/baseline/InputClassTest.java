/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 first_name last_name
 */

package baseline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InputClassTest {

  @Test
  void readFile() {
    InputClass input = new InputClass();

    String expected = """
        badger badger badger
        badger mushroom
        mushroom snake badger badger
        badger""";

    String actual = input.readFile("exercise46_inputTest.txt");

    assertEquals(expected, actual);
  }
}