package hw5;

import java.util.HashMap;
import java.util.Map;

public class AlinaArraysMap {
  public static void main(String[] args) {
    Map<String, String> fruit = new HashMap<String, String>();
    fruit.put("0", "apple");
    fruit.put("1", "mango");
    fruit.put("2", "banana");
    fruit.put("3", "orange");
    fruit.put("4", "lemon");

    for (String key: fruit.keySet())
      System.out.println(fruit.get(key));
  }
}
