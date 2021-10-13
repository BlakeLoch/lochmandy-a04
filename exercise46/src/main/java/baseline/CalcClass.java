/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 first_name last_name
 */

package baseline;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalcClass {

  public Map<String, Integer> countOccurrences(String data) {

    // split the words from data into a list
    List <String> list = Stream.of(data).map(w -> w.split("\\s+")).flatMap(Arrays::stream).toList();

    // return map where the occurrences are counted
    return list.stream()
        .collect(Collectors.toMap(String::toLowerCase, w -> 1, Integer::sum));

  }

}
