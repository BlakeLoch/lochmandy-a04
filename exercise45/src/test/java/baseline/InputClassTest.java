/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InputClassTest {

  @Test
  void readFile() {

    InputClass input = new InputClass();

    String expected = """
        One should never utilize the word "utilize" in writing. Use "use" instead.
        For example, "She uses an IDE to write her Java programs" instead of "She
        utilizes an IDE to write her Java programs".""";

    String actual = input.readFile("exercise45_inputTest.txt");

    assertEquals(expected, actual);

  }
}