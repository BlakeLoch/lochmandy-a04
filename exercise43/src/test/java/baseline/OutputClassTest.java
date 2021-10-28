/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class OutputClassTest {

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
  void buildIndexHtml() {

    OutputClass output = new OutputClass();
    List<String> expected = new ArrayList<>();
    expected.add("<!DOCTYPE html>");
    expected.add("<head>");
    expected.add("\t<title>" + "siteName" + "</title>");
    expected.add("\t<meta author=\"" + "author" + "\">");

    List<String> actual = new ArrayList<>(output.buildIndexHtml("siteName", "author"));

    assertEquals(expected, actual);
  }

  @Test
  void createWebFolder() {
    OutputClass output = new OutputClass();
    String siteName = "testSite";
    output.createWebFolder(siteName);
    assertTrue(Files.exists(Path.of("data" + File.separator + "website" + File.separator + siteName)));
  }

  @Test
  void createIndexHtmlExists() {
    OutputClass output = new OutputClass();
    String siteName = "testSite";
    output.createWebFolder(siteName);
    List<String> indexHtml = new ArrayList<>();
    indexHtml.add("<!DOCTYPE html>");
    indexHtml.add("<head>");
    indexHtml.add("\t<title>" + "siteName" + "</title>");
    indexHtml.add("\t<meta author=\"" + "author" + "\">");

    output.createIndexHtml(siteName, indexHtml);
    assertTrue(Files.exists(
        Path.of("data" + File.separator + "website" + File.separator + siteName + File.separator + "index.html")));

  }

  @Test
  void createIndexHtmlWrites() {
    OutputClass output = new OutputClass();
    String siteName = "testSite";
    output.createWebFolder(siteName);
    String expected = """
        <!DOCTYPE html>
        <head>
        \t<title>testSite</title>
        \t<meta author="Author">
        """;

    List<String> indexHtml = new ArrayList<>();
    indexHtml.add("<!DOCTYPE html>");
    indexHtml.add("<head>");
    indexHtml.add("\t<title>testSite</title>");
    indexHtml.add("\t<meta author=\"Author\">");

    output.createIndexHtml(siteName, indexHtml);

    String actual = readFile("data" + File.separator + "website" + File.separator + "testSite" + File.separator + "index.html");

    assertEquals(expected, actual);

  }

  @Test
  void createJavaScriptFolder() {
    OutputClass output = new OutputClass();
    String siteName = "testSite";
    output.createJavaScriptFolder(siteName, true);
    assertTrue(
        Files.exists(Path.of("data" + File.separator + "website" + File.separator + siteName + File.separator + "js")));
  }

  @Test
  void createCssFolder() {
    OutputClass output = new OutputClass();
    String siteName = "testSite";
    output.createCssFolder(siteName, true);
    assertTrue(
        Files.exists(Path.of("data" + File.separator + "website" + File.separator + siteName + File.separator + "css")));
  }
}