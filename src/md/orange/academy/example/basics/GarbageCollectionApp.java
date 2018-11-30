package md.orange.academy.example.basics;


public class GarbageCollectionApp {

  public String name;

  public static void main(String[] args) {
    GarbageCollectionApp app = new GarbageCollectionApp();
    app.name = "FirstName";
    System.out.println("app = " + app);

    app = null;

    System.out.println("Call GC");
//    Runtime.getRuntime().gc();
    System.gc();

  }

  @Override
  public String toString() {
    return "name = " + this.name;
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("Clear Up name = " + name);
  }
}
