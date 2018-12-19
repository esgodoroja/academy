package md.orange.academy.example.concurrency.synchronizers;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {

  private static final Exchanger<String> EXCHANGER = new Exchanger<>();

  public static void main(String[] args) throws InterruptedException {
    //load packages for first truck
    String[] p1 = new String[]{"{package0 A->D}", "{package1 A->C}"};
    //load packages for second truck
    String[] p2 = new String[]{"{package2 B->C}", "{package3 B->D}"};
    //Send 1st truck from А to D
    new Thread(new Truck(1, "A", "D", p1)).start();
    Thread.sleep(100);
    //Send 2nd truck from B to С
    new Thread(new Truck(2, "B", "C", p2)).start();
    new Thread(new Truck(3, "B", "C", p2)).start();
  }

  public static class Truck implements Runnable {
    private int number;
    private String dep;
    private String dest;
    private String[] parcels;

    public Truck(int number, String departure, String destination, String[] parcels) {
      this.number = number;
      this.dep = departure;
      this.dest = destination;
      this.parcels = parcels;
    }

    @Override
    public void run() {
      try {
        System.out.println(String.format("In truck #%d loaded: %s и %s.", number, parcels[0], parcels[1]));
        System.out.println(String.format("Truck #%d left place %s in place %s.\n", number, dep, dest));
        Thread.sleep(1000 + (long) Math.random() * 5000);
        System.out.println(String.format("Truck X%d arrived in place X.", number));
        //Waits for another thread to arrive at this exchange point (unless
        // the current thread is {@linkplain Thread#interrupt interrupted}),
        // and then transfers the given object to it, receiving its object in return
        parcels[1] = EXCHANGER.exchange(parcels[1]);
        System.out.println(String.format("In truck #%d package exchange for place %s.\n", number, dest));
        Thread.sleep(1000 + (long) Math.random() * 5000);
        System.out.println(String.format("Truck #%d arrived in %s, delivered: %s and %s.\n", number, dest, parcels[0], parcels[1]));
      } catch (InterruptedException e) {
      }
    }
  }

}
