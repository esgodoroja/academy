package md.orange.academy.example.streams.pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertExample {

  static class Student {

    String name;
    Set<String> books = new HashSet<>();
  }

  public static void main(String[] args) {
    List<Integer> aList = Arrays.asList(1, 3, 2, 5, 6, 7, 8, 9, 10, 20, 3, 2, 1);

    Double discount = 0.1;
    System.out.println(aList.stream()
        .mapToDouble(value -> value - value * discount)
        .boxed()
        .collect(Collectors.toList()));

    // flapToMap
    List<Student> students = new ArrayList<>();
    Student student = new Student();
    student.name = "Student A";
    student.books.add("Java 8 Beginners");
    student.books.add("Java 8 Advance");
    Student student1 = new Student();
    student.name = "Student B";
    student.books.add("Java 8 Beginners");

    students.add(student);
    students.add(student1);

    System.out.println(
        students.stream()
            .map(e -> e.books)
            .flatMap(e -> e.stream())
            .distinct()
            .collect(Collectors.joining(", "))

    );
  }

}
