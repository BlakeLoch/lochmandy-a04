/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class OutputClassTest {

  @Test
  void buildIndexHtml() {

    OutputClass output = new OutputClass();
    List<String> expected = new ArrayList<>();
    expected.add("<!DOCTYPE html>");
    expected.add("<head>");
    expected.add("\t<title>"+"siteName"+"</title>");
    expected.add("\t<meta author=\""+"author"+"\">");

    List<String> actual = new ArrayList<>(output.buildIndexHtml("siteName", "author"));

    assertEquals(expected, actual);
  }

}