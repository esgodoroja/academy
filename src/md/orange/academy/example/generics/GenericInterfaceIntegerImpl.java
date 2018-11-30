package md.orange.academy.example.generics;

/**
 * any class wants to implement the interface, it has an option to provide the exact type substitutions.
 * Example: GenericInterfaceIntegerImpl with {@link Integer} type
 */
public class GenericInterfaceIntegerImpl implements GenericInterface<Integer> {

  @Override
  public void performAction(Integer input) {

  }
}
