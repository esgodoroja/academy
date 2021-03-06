package md.orange.academy.example.concurrency.future;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    // Create random number generator
    Random generator = new Random();

    Integer randomNumber = generator.nextInt(5);

    // To simulate a heavy computation,
    // we delay the thread for some random time
    Thread.sleep(randomNumber * 1000);
//    Thread.sleep(randomNumber * 1000);
    return randomNumber;
  }
}
