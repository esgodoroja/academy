package md.orange.academy.example.generics;


/**
 * To define a generic interface it is sufficient to provide the type (or types)
 * it should be parameterized with
 * @param <T>
 */
public interface GenericInterface<T> {

  void performAction(T input);
}
