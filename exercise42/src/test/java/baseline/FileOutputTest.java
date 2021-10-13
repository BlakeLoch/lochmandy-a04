/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.*;

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
  void writeTable() {
    FileOutput fileOut = new FileOutput();

    String expected = """
        Last      First     Salary
        --------------------------
        Ling      Mai       55900
        Johnson   Jim       56500
        Jones     Aaron     46000
        Jones     Chris     34500
        Swift     Geoffrey  14200
        Xiong     Fong      65000
        Zarnecki  Sabrina   51500""";

    List<String> dataTable = new ArrayList<>();
    dataTable.add("Ling      Mai       55900");
    dataTable.add("Johnson   Jim       56500");
    dataTable.add("Jones     Aaron     46000");
    dataTable.add("Jones     Chris     34500");
    dataTable.add("Swift     Geoffrey  14200");
    dataTable.add("Xiong     Fong      65000");
    dataTable.add("Zarnecki  Sabrina   51500");

    fileOut.writeTable(dataTable, "data/exercise42_outputTest.txt");
    String actual = readFile("data/exercise42_outputTest.txt");
    assertEquals(expected, actual);

  }
}