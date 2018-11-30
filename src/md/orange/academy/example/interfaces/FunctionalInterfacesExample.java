package md.orange.academy.example.interfaces;

@FunctionalInterface
public interface FunctionalInterfacesExample {
  String test = "Is IT Constant?";

  void doSomeThing();


  default void doSomeThingByDefault() {
    print("Encapsulating logic in static method");
    System.out.println("calling doSomeThing from doSomeThingByDefault");
    doSomeThing();
  }

  static void print(String input) {
    System.out.println("Let's Say: " + input);
  }

}
