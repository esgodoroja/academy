package md.orange.academy.example.collections.sets.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSetExample {

  public static void main(String[] args) {
    Set<String> linkedSet =
        new LinkedHashSet<>();

    // Adding element to LinkedHashSet
    linkedSet.add("A");
    linkedSet.add("B");
    linkedSet.add("C");
    linkedSet.add("D");

    // This will not add new element as A already exists
    System.out.println("Result of Duplication Input = " + linkedSet.add("A"));

    linkedSet.add("E");

    System.out.println("Size of LinkedHashSet = " +
        linkedSet.size());
    System.out.println("Original LinkedHashSet:" + linkedSet);
    System.out.println("Removing D from LinkedHashSet: " +
        linkedSet.remove("D"));
    System.out.println("Trying to Remove Z which is not "+
        "present: " + linkedSet.remove("Z"));
    System.out.println("Checking if A is present = " +
        linkedSet.contains("A"));
    System.out.println("Updated LinkedHashSet: " + linkedSet);

    linkedSet.clear();
    System.out.println("Checking if set isEmpty = " +
        linkedSet.isEmpty());

  }

}
