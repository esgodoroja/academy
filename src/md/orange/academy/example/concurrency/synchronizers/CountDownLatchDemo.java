package md.orange.academy.example.concurrency.synchronizers;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

  //Create CountDownLatchDemo with 8 conditions
  private static final CountDownLatch START = new CountDownLatch(8);
  //Track length
  private static final int trackLength = 500000;

  public static void main(String[] args) throws InterruptedException {
    for (int i = 1; i <= 5; i++) {
      new Thread(new Car(i, (int) (Math.random() * 100 + 50))).start();
      Thread.sleep(1000);
    }

    while (START.getCount() > 5) //checking if all car come to start line
    {
      Thread.sleep(100);              //wait 100ms till all car arrive
    }

    Thread.sleep(1000);
    System.out.println("Red");
    START.countDown();
    Thread.sleep(1000);
    System.out.println("Yellow");
    START.countDown();
    Thread.sleep(1000);
    System.out.println("Green. Start");
    //when counter equals to 0, all expecting thread start
    START.countDown();
  }

  public static class Car implements Runnable {

    private int carNumber;
    private int carSpeed;

    public Car(int carNumber, int carSpeed) {
      this.carNumber = carNumber;
      this.carSpeed = carSpeed;
    }

    @Override
    public void run() {
      try {
        System.out.println(String.format("Car #%d come to start line.", carNumber));
        //Decrements the count of the latch, releasing all waiting threads if the count reaches zero
        START.countDown();
        //Causes the current thread to wait until the latch has counted down to zero,
        //unless the thread is {@linkplain Thread#interrupt interrupted}
        START.await();
        Thread.sleep(trackLength / carSpeed);//waiting till finish the race
        System.out.println(String.format("Car #%d Finished!", carNumber));
      } catch (InterruptedException e) {
      }
    }
  }

}
