package md.orange.academy.example.collections.sets.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTreeSetExample {

  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("C");
    hashSet.add("B");
    hashSet.add("A");
    hashSet.add("E");
    hashSet.add("A");
    System.out.println("Set output without the duplicates" + hashSet);

/*    hashSet.add(null);
    System.out.println("Set output with null element" + hashSet);

    Iterator iterator = hashSet.iterator();
    System.out.println("Set output without the duplicates by iterator");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }*/

    System.out.print("Sorted Set after passing into TreeSet");
    Set<String> treeSet = new TreeSet<>(hashSet);
    System.out.println(treeSet);
    Iterator iterator = ((TreeSet<String>) treeSet).descendingSet().iterator();
    System.out.println("TreeSet descendingSet");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    treeSet.add(null);
  }
}
