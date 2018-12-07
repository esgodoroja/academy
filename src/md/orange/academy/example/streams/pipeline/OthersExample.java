package md.orange.academy.example.streams.pipeline;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OthersExample {

  public static void main(String[] args) {
    List<Integer> aList = Arrays.asList(1, 3, 2, 5, 6, 7, 8, 9, 10, 20, 3, 2, 1);
    System.out.println(
        aList.stream()
//            .distinct()
//            .sorted()
            .map(integer -> integer + 1)
            .peek(e -> System.out.println("processing = " + --e))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList()));
  }
}
