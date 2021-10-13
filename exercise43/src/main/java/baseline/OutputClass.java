/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OutputClass {

  private static final String WEBSITE = "data/website";
  private static final String CREATED_WEBSITE = "Created ./website/";
  private static final String DIRECTORY_ALREADY_EXISTS = "Directory already exists";

  public void createWebFolder(String siteName) {
    // create folder website/siteName
    File webFolder = new File(WEBSITE + File.separator + siteName);
    if (webFolder.mkdirs()) {
      // print "Created ./website/'siteName'"
      System.out.println(CREATED_WEBSITE + siteName);
    } else {
      // print "Directory already exists"
      System.out.println(DIRECTORY_ALREADY_EXISTS);
    }
  }

  public List<String> buildIndexHtml(String siteName, String author) {
    List<String> indexHtml = new ArrayList<>();
    // add "<!DOCTYPE html>
    indexHtml.add("<!DOCTYPE html>");
    //add <head>
    indexHtml.add("<head>");
    // add "<title>"'siteName'"</title>" to index.html
    indexHtml.add("\t<title>" + siteName + "</title>");
    // add "<meta author="'author'">" to index.html
    indexHtml.add("\t<meta author=\"" + author + "\">");

    return indexHtml;
  }

  public void createIndexHtml(String siteName, List<String> indexHtml) {
    // create file website/'siteName'/index.html
    try (FileWriter output = new FileWriter(
        WEBSITE + File.separator + siteName + File.separator + "index.html")) {

      // write each line of index.html to file
      for (String line : indexHtml) {
        output.write(line + "\n");
      }

      // print "Created ./website/'siteName'/index.html"
      System.out.println(CREATED_WEBSITE + siteName + "/index.html");
      // close file
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void createJavaScriptFolder(String siteName, boolean javaScriptFolder) {
    // if javaScriptFolder is true
    if (javaScriptFolder) {
      // create folder website/'siteName'/js
      File webFolder = new File(WEBSITE + File.separator + siteName + File.separator + "js");
      if (webFolder.mkdirs()) {
        // print "Created ./website/'siteName'/js"
        System.out.println(CREATED_WEBSITE + siteName + "/js");
      } else {
        // print "Directory already exists"
        System.out.println(DIRECTORY_ALREADY_EXISTS);
      }
    }
  }

  public void createCssFolder(String siteName, boolean cssFolder) {
    // if cssFolder is true
    if (cssFolder) {
      // create folder website/'siteName'/css
      File webFolder = new File(WEBSITE + File.separator + siteName + File.separator + "css");
      if (webFolder.mkdirs()) {
        // print "Created ./website/'siteName'/css"
        System.out.println(CREATED_WEBSITE + siteName + "/css");
      } else {
        // print "Directory already exists"
        System.out.println(DIRECTORY_ALREADY_EXISTS);
      }
    }
  }

}
