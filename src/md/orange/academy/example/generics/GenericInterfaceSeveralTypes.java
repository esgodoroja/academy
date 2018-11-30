package md.orange.academy.example.generics;

public interface GenericInterfaceSeveralTypes<T, R> {

  R save(T input);
  R get(T input);
  void update(T input);

}
