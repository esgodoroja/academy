package md.orange.academy.example.generics;

public class GenericInterfaceStringImpl implements GenericInterface<String> {

  @Override
  public void performAction(String input) {
    System.out.println("input = " + input);
  }
}
