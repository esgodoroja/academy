package md.orange.academy;

public class Main {

  private String name;

  public Main(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    Main fistObject = new Main("first");

    fistObject = null;

    Thread th1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out
            .println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
      }
    });
    Thread th2 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out
            .println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
      }
    });
    System.gc();

    Main secondObject = new Main("second");

    Runtime.getRuntime().gc();

    secondObject = null;

    Runtime.getRuntime().gc();

    Runtime.getRuntime().exit(1);
  }

  @Override
  public String toString() {
    return "Main{" +
        "name='" + name + '\'' +
        '}';
  }

  @Override
  protected void finalize() {
    System.out.println("Perform GB ");
    System.out.println("Object Cleared: " + this);
  }
}
