package md.orange.academy.example.streams;

import java.util.Arrays;
import java.util.List;

public class WhyStreamsApp {

  public static void main(String[] args) {
    List<Integer> aList = Arrays.asList(1, 3, 2, 5, 6, 7, 8, 9, 10, 20, 3, 2, 1);
    int result = 0;

    //old school)
//    System.out.println("-=simple for=-");
//    for (int i = 0; i < aList.size(); i++) {
//      if (aList.get(i) % 2 == 0) {
//        result += aList.get(i) * 2;
//      }
//    }
//
//    System.out.println("-=for iterator=-");
//    for (int e : aList) {
//      if (e % 2 == 0) {
//        result += e * 2;
//      }
//    }
//
//    //iterator
//    System.out.println("-=iterator=-");
//    Iterator<Integer> iterator = aList.iterator();
//    while (iterator.hasNext()) {
//      Integer current = iterator.next();
//      if (current % 2 == 0) {
//        result += current * 2;
//      }
//    }
//    System.out.println("result = " + result);


    System.out.println("-=Stream=-");
    System.out.println(
        aList.stream()
            .filter(e -> e % 2 == 0)
//            .distinct()
            .mapToInt(e -> e * 2)
            .sum()
//        .reduce(0, Integer::sum)
    );
  }
}
