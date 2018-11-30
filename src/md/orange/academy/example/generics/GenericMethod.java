package md.orange.academy.example.generics;

public class GenericMethod {


  public static <T> void displayGenericType(T generic) {
    System.out.println("generic = " + generic);
    System.out.println("generic.getClass() = "
        + generic.getClass());
    System.out.println("generic is a Number = "
        + (generic instanceof Double));
  }
  public static void main(String... args) {
    displayGenericType("some String");
    displayGenericType(123);

  }

  public static <T, R> void displaySeveralGenericType(T generic,
      R generic1) {

  }
}
