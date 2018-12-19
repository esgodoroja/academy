package md.orange.academy.example.concurrency.thread.methods;

public class JoinDemo {

  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName()
            + " in join");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
      }

    });
    t.start();
    t.join(2000);

    System.out.println("continue main");
  }
}
