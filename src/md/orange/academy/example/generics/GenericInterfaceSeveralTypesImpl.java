package md.orange.academy.example.generics;

public class GenericInterfaceSeveralTypesImpl
    implements GenericInterfaceSeveralTypes<String, Integer> {

  @Override
  public Integer save(String input) {
    //in this case it can be identity of entity or index of our array
    //null in case when something goes wrong
    return null;
  }

  @Override
  public Integer get(String input) {
    // return object by string criteria
    return null;
  }

  @Override
  public void update(String input)  {
  }

}
