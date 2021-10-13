/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OutputClassTest {

  @Test
  void writeToFile() {

    InputClass input = new InputClass();
    OutputClass output = new OutputClass();

    String expected = """
        One should never use the word "use" in writing. Use "use" instead.
        For example, "She uses an IDE to write her Java programs" instead of "She
        uses an IDE to write her Java programs".""";

    String toBePrinted = """
        One should never use the word "use" in writing. Use "use" instead.
        For example, "She uses an IDE to write her Java programs" instead of "She
        uses an IDE to write her Java programs".""";

    output.writeToFile("exercise45_outputTest.txt", toBePrinted);

    String actual = input.readFile("exercise45_outputTest.txt");

    assertEquals(expected, actual);

  }
}