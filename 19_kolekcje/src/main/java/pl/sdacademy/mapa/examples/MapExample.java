package pl.sdacademy.mapa.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
  // peppers();

countWordExample();
  }

  private static void peppers() {
    Map<String, Integer> peppers = new HashMap<>();

    peppers.put("Pepperoni", 100);
    peppers.put("Jalapeno", 2_500);
    peppers.put("Habanero", 100_000);
    peppers.put("Pepper X", 3_180_000);

    System.out.println(peppers);
    System.out.println();
    System.out.println(peppers.get("Pepper X"));
    System.out.println();
    System.out.println(peppers.entrySet());

    for (Map.Entry<String, Integer> entry : peppers.entrySet()) {
      if (entry.getValue() == 100) {
        System.out.println(entry.getKey());
      }
    }

  }
  private static void countWordExample () {
    String anyString = "";

    List<String> listOfWords = Arrays.asList(anyString.split("\\s"));
    Map<String, Integer> words = new HashMap<>();

    for (String word : listOfWords) {
      if(words.containsKey(word)) {
        words.put(word, words.get(word) + 1);
      } else {
        words.put(word, 1);
      }
    }

    System.out.println(words);
  }
}
