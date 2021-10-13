/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void replaceUtilizeWithUse() {

    CalcClass calc = new CalcClass();

    String expected = "I use IntelliJ to program Java.";
    String base = "I utilize IntelliJ to program Java.";
    String actual = calc.replaceUtilizeWithUse(base);

    assertEquals(expected, actual);
  }

}