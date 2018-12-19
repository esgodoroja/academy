package md.orange.academy.example.concurrency.sync.idioms;

public class SynchronizedMethod {


  public static void main(String[] args) {
    MethodExample methodExample = new MethodExample();

    new Thread(() -> {
      while (!Thread.currentThread().isInterrupted()) {
        methodExample.increment();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignore) {
        }
      }
    }).start();
    new Thread(() -> {

      while (!Thread.currentThread().isInterrupted()) {
        methodExample.increment();
        try {
          Thread.sleep(1500);
        } catch (InterruptedException ignore) {
        }
      }
    }).start();
    new Thread(() -> {
      while (!Thread.currentThread().isInterrupted()) {
        methodExample.increment(100_000);
        try {
          Thread.sleep(10000);
        } catch (InterruptedException ignore) {}
      }
    }).start();


    new Thread(() -> {
      while (!Thread.currentThread().isInterrupted()) {
        methodExample.decrement();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignore) {}
      }
    }).start();
    new Thread(() -> {
      while (!Thread.currentThread().isInterrupted()) {
        methodExample.decrement(2);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignore) {}
      }
    }).start();
    new Thread(() -> {
      while (!Thread.currentThread().isInterrupted()) {
        System.out.println("counter current value: "
            + methodExample.getCounter());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignore) {}
      }

    }).start();
  }

}
