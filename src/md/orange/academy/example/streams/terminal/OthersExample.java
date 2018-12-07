package md.orange.academy.example.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OthersExample {

  public static void main(String[] args) {
    List<Integer> aList = Arrays.asList(1, 3, 2, 5, 6, 7, 8, 9, 10, 20, 3, 2, 1);

    Set<Integer> integerSet = aList.stream().collect(Collectors.toSet());

    System.out.println("integerSet = " + integerSet);

    System.out.println("foreach");
    aList.stream().parallel().forEach(integer -> System.out.println("integer = " + integer));

    System.out.println(" foreach ordered");
    aList.stream().parallel().forEachOrdered(integer -> System.out.println("integer = " + integer));
  }
}
