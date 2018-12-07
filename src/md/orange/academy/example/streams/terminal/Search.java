package md.orange.academy.example.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Search {

  public static void main(String[] args) {
    List<Integer> aList = Arrays.asList(1, 3, 2, 5, 6, 7, 8, 9, 10, 20, 3, 2, 1);
    Optional<Integer> integer = aList.stream()
        .filter(e -> e > 100)
//        .findFirst()
        .findAny();
    System.out.println("integer = " + integer.orElse(0));

    System.out.println("anyMatch >= '1' = " + aList.stream().anyMatch(e -> e >= 1));
    System.out.println("noneMatch >= '1' = " + aList.stream().noneMatch(e -> e < 1));
    System.out.println("allMatch >= '1' = " + aList.stream().allMatch(e -> e >= 1));
  }
}
