package md.orange.academy.example.concurrency.synchronizers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

public class PhaserDemo {

  /**
   *  parties the number of parties required to advance to the next phase
   */
  private static final Phaser BUS_PHASER = new Phaser(1);
  //0 and 6 - start/end bus stop, 1 - 5 bus stop

  public static void main(String[] args) {
    List<Passenger> passengers = new ArrayList<>();

    //generation passengers
    for (int i = 1; i < 5; i++) {
      if ((int) (Math.random() * 2) > 0) {
//        System.out.println("add passenger till next bus stop ");
        passengers.add(new Passenger(i, i + 1));//go down next bus stop
      }

      if ((int) (Math.random() * 2) > 0) {
//        System.out.println("add passenger till last bus stop");
        passengers.add(new Passenger(i, 5));    //till the end
      }
    }

    for (int i = 0; i < 7; i++) {
      switch (i) {
        case 0:
          System.out.println("Bus exit from garage(first bus stop).");
          //Arrives at this phaser, without waiting for others to arrive
          BUS_PHASER.arrive();
          break;
        case 6:
          System.out.println("Bus at last bus stop(garage).");
          //Arrives at this phaser and cancel registration from it without waiting
          // for others to arrive. Cancel registration reduces the number of
          // parties required to advance in future phases
          BUS_PHASER.arriveAndDeregister();
          break;
        default:
          int currentBusStop = BUS_PHASER.getPhase();
          System.out.println("bus stop #" + currentBusStop);

          //Check if any passenger is waiting the bus
          for (Passenger p : passengers) {
            if (p.departure == currentBusStop) {
              //Adds a new unarrived party to this phaser
              BUS_PHASER.register();
              p.start();
            }
          }
          //Arrives at this phaser and awaits others. Equivalent in effect
          // to awaitAdvance(arrive())
          BUS_PHASER.arriveAndAwaitAdvance();
      }
    }
  }

  public static class Passenger extends Thread {

    private int departure;
    private int destination;

    Passenger(int departure, int destination) {
      this.departure = departure;
      this.destination = destination;
      System.out.println(this + " waiting at bus stop #" + this.departure);
    }

    @Override
    public void run() {
      try {
        System.out.println(this + " get up into bus.");

        //check if it's passenger station
        while (BUS_PHASER.getPhase() < destination) {
          //waits until reach his bus station
          BUS_PHASER.arriveAndAwaitAdvance();
        }

        Thread.sleep(1);
        System.out.println(this + " goes down. his station.");
        //Arrives at this phaser and deregisters from it without waiting
        // for others to arrive
        BUS_PHASER.arriveAndDeregister();
      } catch (InterruptedException ignore) {
      }
    }

    @Override
    public String toString() {
      return "Passenger{" + departure + " -> " + destination + '}';
    }
  }

}
