package md.orange.academy.example.generics;

public class GenericLimitations<T> {

  T[] array;

  public void set(T[] array) {
    this.array = array;
  }

  public void addElement(T value, int index) {
    if (value instanceof Number)
      this.array[index] = value;
  }


  public static void main(String... args) {
    GenericLimitations example = new GenericLimitations();
    example.set(new Object[2]);

    example.addElement("firstValue", 0);
    example.addElement(123, 1);
    System.out.println("example.array[0] = " + example.array[0]);
    System.out.println("example.array[0] = " + example.array[1]);

  }
}
