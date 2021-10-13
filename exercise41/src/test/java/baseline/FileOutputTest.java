/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class FileOutputTest {

  private String readFile(String file) {

    // read file as a string
    String data = "";
    try {
      data = Files.readString(Path.of(file));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // return the string
    return data;

  }

  @Test
  void writeNames() {

    FileOutput fileOut = new FileOutput();

    String expected = """
        Total of 7 names
        -----------------
        Johnson, Jim
        Jones, Aaron
        Jones, Chris
        Ling, Mai
        Swift, Geoffrey
        Xiong, Fong
        Zarnecki, Sabrina""";

    List<String> names = new ArrayList<>();
    names.add("Johnson, Jim");
    names.add("Jones, Aaron");
    names.add("Jones, Chris");
    names.add("Ling, Mai");
    names.add("Swift, Geoffrey");
    names.add("Xiong, Fong");
    names.add("Zarnecki, Sabrina");

    fileOut.writeNames(names, "data/exercise41_outputTest.txt");

    String actual = readFile("data/exercise41_outputTest.txt");

    assertEquals(expected, actual);

  }
}