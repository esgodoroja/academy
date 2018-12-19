package md.orange.academy.example.concurrency.synchronizers;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

  private static final CyclicBarrier BARRIER =
      new CyclicBarrier(3, new FerryBoat());

  public static void main(String[] args) throws InterruptedException {
    for (int i = 0; i < 10; i++) {
      new Thread(new Car(i)).start();
      Thread.sleep(400);
    }

    System.out.println("BARRIER.NumberWaiting = " + BARRIER.getNumberWaiting());
    System.out.println("BARRIER.Parties = " + BARRIER.getParties());
  }

  public static class FerryBoat implements Runnable {
    @Override
    public void run() {
      try {

        Thread.sleep(500);
        System.out.println("FerryBoat ferried cars!");
      } catch (InterruptedException e) {
      }
    }
  }

  public static class Car implements Runnable {
    private int carNumber;

    public Car(int carNumber) {
      this.carNumber = carNumber;
    }

    @Override
    public void run() {
      try {
        Thread.sleep(1000 + (long) Math.random() * 50);
        System.out.println(String.format("Car #%d drove up to the ferry."
            , carNumber));
        //Waits until all threads have invoked await on this barrier
        BARRIER.await();
        System.out.println(String.format("Car #%d continue journey.", carNumber));
      } catch (Exception e) {
      }
    }
  }

}
