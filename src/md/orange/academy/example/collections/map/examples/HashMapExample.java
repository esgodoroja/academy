package md.orange.academy.example.collections.map.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

  public static final String VICTOR = "Victor";
  public static final String EVGHENII = "EVGHENII";
  public static final String VALERA = "Valera";
  public static final String ION = "Ion";

  public static void main(String[] args) {

    HashMap<String, Integer> map = new HashMap<>();

    print(map);
    map.put(VALERA, 10);
    map.put(EVGHENII, 30);
    map.put(VALERA, 20);

    System.out.println("map.put existing key result = " + map.put(VALERA, 25));
    System.out.println("map.putIfAbsent result = " + map.putIfAbsent(VALERA, 50));



    System.out.println("Size of map is:- " + map.size());

    print(map);
    if (map.containsKey(VALERA)) {
      Integer a = map.get(VALERA);
      System.out.println("value for key \"" + VALERA + "\" is:- " + a);
    }

    //

    print(map);
    map.clear();
    print(map);
  }


  public static void print(Map<String, Integer> map) {
    if (map.isEmpty()) {
      System.out.println("map is empty");
    } else {
      System.out.println(map);
    }
  }
}
