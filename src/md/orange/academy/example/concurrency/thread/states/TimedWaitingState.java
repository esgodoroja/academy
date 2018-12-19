package md.orange.academy.example.concurrency.thread.states;

public class TimedWaitingState {

  public static void main(String[] args) throws InterruptedException {
    DemoThread obj1 = new DemoThread();
    Thread t1 = new Thread(obj1);
    t1.start();

    // The following sleep will give enough time for ThreadScheduler
    // to start processing of thread t1
    Thread.sleep(1000);
    System.out.println("t1.getState() " + t1.getState());
  }
}

class DemoThread implements Runnable {
  @Override
  public void run() {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      System.out.println("Thread interrupted");
    }
  }
}
