package md.orange.academy.example.generics;

public interface GenericNumberBoundingExample<T extends Number> {

  T plus(T arg0, T arg1);

}
