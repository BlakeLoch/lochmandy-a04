/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Blake Lochmandy
 */

package baseline;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class InputClass {

  // import data from json to list of maps
  public List<HashMap<String, String>> importJson(String dataFile) {

    //process data
    String data = processRawData(dataFile);

    // initiate Gson
    Gson gson = new Gson();
    // set list type
    Type listType = new TypeToken<List<HashMap<String, String>>>(){}.getType();
    // import data into list of maps
    return gson.fromJson(data, listType);
  }

  // process data
  private String processRawData(String dataFile) {

    String data = "";
    try {
      data = Files.readString(Path.of(dataFile));
      data = data.substring(data.indexOf("["));
      data = data.trim();
      data = data.substring(0, data.indexOf("]")+1);

    } catch (IOException e) {
      e.printStackTrace();
    }

    return data;

  }

}
