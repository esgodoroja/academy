package md.orange.academy.example.concurrency.thread.methods;

public class YieldDemo {

  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName()
            + " in control");
        try {
          Thread.sleep(10);
        } catch (InterruptedException ignore) {
        }
      }
    });
    t.start();

    for (int i = 0; i < 5; i++) {
      // Control passes to child thread
      Thread.yield();

      // After execution of child Thread
      // main thread takes over
      System.out.println(Thread.currentThread().getName()
          + " in control");
    }
  }

}
