package md.orange.academy.example.classes;

import java.util.Arrays;

public class ImmutableClass {

  //firstly all variables should be final
  private final long id;
  private final String[] arrayOfStrings;

  // secondly all input parameters should be final
  public ImmutableClass(final long id, final String[] arrayOfStrings) {
    this.id = id;
    //reference will not guaranty
//    this.arrayOfStrings = arrayOfStrings;
    this.arrayOfStrings =
        Arrays.copyOf(arrayOfStrings, arrayOfStrings.length);
  }

  public String[] getArrayOfStrings() {
//    return arrayOfStrings;
    return Arrays.copyOf(arrayOfStrings, arrayOfStrings.length);
  }
}
