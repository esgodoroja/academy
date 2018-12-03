package md.orange.academy.example.collections.map.examples;

import java.util.Hashtable;

public class HashTableExample {

  public static void main(String[] arg) {
    // creating a hash table
    Hashtable hashtable = new Hashtable();

    Hashtable clone = new Hashtable();

    hashtable.put(3, "Ion");
    hashtable.put(2, "Evghenii");
    hashtable.put(1, "Victor");

    hashtable.computeIfAbsent(4, key -> "Ion + Lia");

    // create a clone or shallow copy of hash table h
    clone = (Hashtable) hashtable.clone();

    // checking clone
    System.out.println("values in clone: " + clone);

    // clear hash table hashtable
    hashtable.clear();

    // checking hash table hashtable
    System.out.println("after clearing: " + hashtable);
    System.out.println("after clearing: " + clone);
  }

}
