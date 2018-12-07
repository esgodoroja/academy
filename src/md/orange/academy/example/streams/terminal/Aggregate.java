package md.orange.academy.example.streams.terminal;

import java.util.Arrays;
import java.util.List;

public class Aggregate {

  public static void main(String[] args) {
    List<Integer> aList = Arrays.asList(1, 3, 2);
//    List<Integer> aList = Arrays.asList();
    System.out.println("aList.stream().count() = " + aList.stream().count());
    System.out.println("aList.stream().min() = " + aList.stream().min(Integer::compareTo));
    System.out.println("aList.stream().max() = " + aList.stream().max(Integer::compareTo));
    System.out.println("aList.stream().reduce() = " + aList.stream().reduce((x, y) -> x + y));

    List<String> stringList = Arrays.asList("1", "3", "2");
    System.out.println(stringList.stream().parallel().reduce("Concatenation Result: ",
        (x, y) -> {
          if (y.equals("3")) {
            return x + "";
          }
          return x + y;
        }, (x, y) -> x + ", " + y)
    );
  }

}
