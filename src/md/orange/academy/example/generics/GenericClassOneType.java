package md.orange.academy.example.generics;

public class GenericClassOneType<T> {

  T t;
  public void set(T t) {
    this.t = t;
  } 
  
  public void printGenericInfo() {
    System.out.println("t = " + t);
    System.out.println("t.getClass() = " + t.getClass());
  }
  
  public static void main(String... ag) {
    GenericClassOneType example = new GenericClassOneType<>();
    example.set(10);
    example.printGenericInfo();

//    GenericClassOneType<String> stringExample = new GenericClassOneType<>();
    example.set("Some String");
    example.printGenericInfo();

    example.set(34.5d);
    example.printGenericInfo();
    
  }
  
  
}
