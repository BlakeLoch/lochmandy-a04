/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputClass {
  
  public void createWebFolder(String siteName) {
    // create folder website/siteName
    File webFolder = new File("website"+File.separator+siteName);
    if(webFolder.mkdirs()) {
      // print "Created ./website/'siteName'"
      System.out.println("Created ./website/" + siteName);
    } else {
      // print "Directory already exists"
      System.out.println("Directory already exists");
    }
  }

  public void createIndexHtml(String siteName, String author) {
    // create file website/'siteName'/index.html
    try (FileWriter output = new FileWriter("website"+File.separator+siteName+File.separator+"index.html")) {
      // write "<title>"'siteName'"<\title>" to index.html
      output.write("<title>"+siteName+"<\\title>\n");
      // write "<meta>"'author'"<\meta>" to index.html
      output.write("<author>"+author+"<\\meta>");
      // print "Created ./website/'siteName'/index.html"
      System.out.println("Created ./website/" + siteName + "/index.html");
      // close file
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void createJavaScriptFolder(String siteName, boolean javaScriptFolder) {
    // if javaScriptFolder is true
    if (javaScriptFolder) {
      // create folder website/'siteName'/js
      File webFolder = new File("website"+File.separator+siteName+File.separator+"js");
      if(webFolder.mkdirs()) {
        // print "Created ./website/'siteName'/js"
        System.out.println("Created ./website/" + siteName + "/js");
      } else {
        // print "Directory already exists"
        System.out.println("Directory already exists");
      }
    }
  }

  public void createCssFolder(String siteName, boolean cssFolder) {
    // if cssFolder is true
    if (cssFolder) {
      // create folder website/'siteName'/css
      File webFolder = new File("website"+File.separator+siteName+File.separator+"css");
      if(webFolder.mkdirs()) {
        // print "Created ./website/'siteName'/css"
        System.out.println("Created ./website/" + siteName + "/css");
      } else {
        // print "Directory already exists"
        System.out.println("Directory already exists");
      }
    }
  }

}
