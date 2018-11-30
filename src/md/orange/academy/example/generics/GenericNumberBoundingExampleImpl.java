package md.orange.academy.example.generics;

public class GenericNumberBoundingExampleImpl
    implements GenericNumberBoundingExample<Integer> {

  @Override
  public Integer plus(Integer arg0, Integer arg1) {
    if(arg0 != null &&  arg1 != null) {
      return arg0 + arg1;
    }
    return null;
  }
}
