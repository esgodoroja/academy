package md.orange.academy.example.concurrency.monitor;

public class LocksDemo {

  public static void main(String[] args) {
    Locks example = new Locks();
    new Thread(() -> {
      for (int i = 0; i< 10; i++) {
        new Thread(() -> example.decrement()).start();
      }
    }).start();

    new Thread(() -> {
      for (int i = 0; i< 10; i++) {
        new Thread(() -> example.increment()).start();
      }
    }).start();
    System.out.println("result: " + example.count);
    System.out.println("=========================");
    example.simpleBenefits();
    System.out.println("=========================");
    example.readWriteLock();
  }

}
