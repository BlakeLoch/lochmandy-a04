/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

public class OutputClass {
  
  public void createWebFolder(String siteName) {
    // create folder website/siteName
    // print "Created ./website/'siteName'"
  }

  public void createIndexHtml(String siteName, String author) {
    // create file website/'siteName'/index.html
    // write <title>"'siteName'"<\title> to index.html
    // write <meta>"'author'"<\meta> to index.html
    // print "Created ./website/'siteName'/index.html"
  }

  public void createJavaScriptFolder(String siteName, Boolean javaScriptFolder) {
    // if javaScriptFolder is true
    // create folder website/'siteName'/js
    // print "Created ./website/'siteName'/js"
  }

  public void createCssFolder(String siteName, Boolean cssFolder) {
    // if cssFolder is true
    // create folder website/'siteName'/css
    // print "Created ./website/'siteName'/css"
  }

}
