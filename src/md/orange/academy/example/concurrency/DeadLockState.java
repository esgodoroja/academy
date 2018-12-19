package md.orange.academy.example.concurrency;

public class DeadLockState {

  /**
   * Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by
   * another thread(second) and second thread is waiting for an object lock that is acquired by first thread.
   * Since, both threads are waiting for each other to release the lock, the condition is called deadlock
   */
  public static void main(String[] args) throws InterruptedException {
    Integer resourceA = new Integer(0);
    Integer resourceB = new Integer(1);

    Thread thX = new Thread(() -> {
      System.out.println("Start thX");
      synchronized (resourceA) {
        System.out.println("thX has resourceA = " + resourceA);
        try {
          Thread.sleep(2);
        } catch (InterruptedException ignore) {
        }
        synchronized (resourceB) {
          System.out.println("thX has resourceB = " + resourceB);
        }

        System.out.println("thX...notify");
      }
    });
    Thread thY = new Thread(() -> {
      System.out.println("Start thY");
      synchronized (resourceA) {
        System.out.println("thY has resourceA = " + resourceA);
        try {
          Thread.sleep(2);
        } catch (InterruptedException ignore) {
        }
        synchronized (resourceB) {
          System.out.println("thY has resourceB = " + resourceB);
        }

        System.out.println("thY ...notify");
      }
    });

    thX.start();
    thY.start();
    Thread.sleep(1000);
    System.out.println("thY.getState() = " + thY.getState());
    System.out.println("thX.getState() = " + thX.getState());

    System.exit(-1);
  }

}
