package md.orange.academy.example.enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {

  static Set<EnumExample> enumExampleSet = EnumSet.allOf(EnumExample.class);
  static Set<EnumExample> enumExampleSetOf = EnumSet.of(EnumExample.MONDAY, EnumExample.SUNDAY);
  static Map<EnumExample, String> enumExampleStringMap = new EnumMap(EnumExample.class);

  public static void main(String[] args) {
    System.out.println("enumExampleSet");
    enumExampleSet.forEach(e -> System.out.println("e.name() = " + e.name()));
    System.out.println("enumExampleSetOf");
    enumExampleSetOf.forEach(e -> System.out.println("e.name() = " + e.name()));

    System.out.println("map");
    enumExampleStringMap.put(EnumExample.MONDAY, "George");
    enumExampleStringMap.put(EnumExample.TUESDAY, "Victor");
    enumExampleStringMap.put(EnumExample.WEDNESDAY, "Eugene");
    enumExampleStringMap.put(EnumExample.THURSDAY, "");
    enumExampleStringMap.put(EnumExample.FRIDAY, "");
    enumExampleStringMap.forEach((k, v) -> System.out.println("Duty on : " + k + "; Name: " + v));

  }

}
