package md.orange.academy.example.streams.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringExample {

  public static void main(String[] args) {
    List<Integer> aList = Arrays.asList(1, 3, 2, 5, 6, 7, 8, 9, 10, 20, 3, 2, 1);
    System.out.println(
        aList.stream()
            .skip(3)
            .filter(e -> e > 7)
            .limit(5)
            .collect(Collectors.toList()));
  }

}
