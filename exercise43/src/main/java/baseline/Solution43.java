/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution43 {

  public static void main(String[] args) {

    // Link Helper Classes
    InputClass input = new InputClass();
    OutputClass output = new OutputClass();

    // Get input from user
    String siteName = input.getSiteNameFromUser();
    String author = input.getAuthorFromUser();
    Boolean javaScriptFolder = input.askIfJavaScriptFolder();
    Boolean cssFolder = input.askIfCssFolder();

    // Create files
    output.createWebFolder(siteName);
    List<String> indexHtml = new ArrayList<>(output.buildIndexHtml(siteName, author));
    output.createIndexHtml(siteName, indexHtml);
    output.createJavaScriptFolder(siteName, javaScriptFolder);
    output.createCssFolder(siteName, cssFolder);

  }

}
