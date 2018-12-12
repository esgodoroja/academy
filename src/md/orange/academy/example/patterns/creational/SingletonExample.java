package md.orange.academy.example.patterns.creational;

public class SingletonExample {

  private static SingletonExample instance;

  public static SingletonExample getInstance() {
    if(instance == null) {
      instance = new SingletonExample();
    }
    return instance;
  }

  private void privateMethod() {
    System.out.println("print from private method: " + instance.hashCode());
  }

  void packageMethod() {
    System.out.println("print from package method: " + instance.hashCode());
  }

  public void publicMethod() {
    System.out.println("print from public method: " + instance.hashCode());
  }


}
