/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 first_name last_name
 */

package baseline;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OutputClass {

  public void printHistogram(Map<String, Integer> frequencies) {

    // sort frequencies in descending order
    frequencies = sortFrequencies(frequencies);
    // for each word in frequencies
    Set<String> words = frequencies.keySet();
    int longestWordLength = longestWordLength(words);
    String format = "%-"+(longestWordLength+2)+"s";
    for (String word : words) {
      // print "'word':"
      System.out.printf(format, word+":");
      // loop from 1 to the integer frequency of word
      for (int j = 0; j < frequencies.get(word); j++) {
        // print "*"
        System.out.print("*");
      }
    // print newline
    System.out.print("\n");
    }

  }

  private Map<String, Integer> sortFrequencies(Map<String, Integer> frequencies) {
    // convert map to list of maps
    List<Map.Entry<String, Integer>> list =
        new LinkedList<>(frequencies.entrySet());

    list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

    // Loop list into an ordered map
    Map<String, Integer> sortedFrequencies = new LinkedHashMap<>();
    for (Map.Entry<String, Integer> word : list) {
      sortedFrequencies.put(word.getKey(), word.getValue());
    }

    return sortedFrequencies;

  }

  private int longestWordLength(Set<String> words) {
    String longestWord = "";
    for (String word : words) {
      if (word.length() > longestWord.length()) {
        longestWord = word;
      }
    }
    return longestWord.length();
  }

}
