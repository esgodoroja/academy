package md.orange.academy.example.concurrency.thread.methods;

public class InterruptDemo {

  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(() -> {
      while (!Thread.currentThread().isInterrupted()) {
        System.out.println("Thread.currentThread().getState() = "
            + Thread.currentThread().getState());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println(e.getMessage());
          Thread.interrupted();
        }
      }

    });
    t.start();


    Thread.sleep(10000);
    System.out.println("t.getState() = " + t.getState());
    t.interrupt();
    System.out.println("t.getState() = " + t.getState());
    Thread.sleep(100);
    System.out.println("t.getState() = " + t.getState());

  }

}
