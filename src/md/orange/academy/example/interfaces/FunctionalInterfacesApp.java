package md.orange.academy.example.interfaces;

public class FunctionalInterfacesApp {

  public static void main(String... arg) {
    FunctionalInterfacesExample example = () -> System.out.println("true = " + true);

    example.doSomeThing();
    example.doSomeThingByDefault();
    FunctionalInterfacesExample example1 = () -> System.out.println("from 1, true = " + true);
    example1.doSomeThing();
//    example1.print("Hi from example1");
  }
}
