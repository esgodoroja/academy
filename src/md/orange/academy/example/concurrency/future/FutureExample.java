package md.orange.academy.example.concurrency.future;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureExample {

  public static void main(String[] args) throws Exception {

    // FutureTask is a concrete class that
    // implements both Runnable and Future
    FutureTask[] randomNumberTasks = new FutureTask[5];

    for (int i = 0; i < 5; i++) {
      Callable callable = new CallableExample();

      // Create the FutureTask with Callable
      randomNumberTasks[i] = new FutureTask(callable);

      // As it implements Runnable, create Thread
      // with FutureTask
      Thread t = new Thread(randomNumberTasks[i]);
      t.start();
    }
    System.out.println("generation complected");
    Thread.sleep(1010);
    System.out.println("sleep complected");
    for (int i = 0; i < 5; i++) {
      // As it implements Future, we can call get()
      System.out.println(randomNumberTasks[i].get());

      // This method blocks till the result is obtained
      // The get method can throw checked exceptions
      // like when it is interrupted. This is the reason
      // for adding the throws clause to main
    }

  }
}
