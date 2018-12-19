package md.orange.academy.example.concurrency.pools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorsExample {

  static final Executor esSingleThread = Executors.newSingleThreadExecutor(
//      new ThreadFactoryBuilder().setNamePrefix("singleThread_").build()
  );
  static final Executor esFixedThreadPool = Executors.newFixedThreadPool(10
//      , new ThreadFactoryBuilder().setNamePrefix("fixed_").build()
  );
  static final Executor esCachedThreadPool = Executors.newCachedThreadPool(
//      new ThreadFactoryBuilder().setNamePrefix("cached_").build()
  );
  static final ScheduledExecutorService esScheduleSingle = Executors
      .newSingleThreadScheduledExecutor(
//      new ThreadFactoryBuilder().setNamePrefix("singleThreadScheduler_").build()
      );
  static final ScheduledExecutorService esSchedule = Executors.newScheduledThreadPool(2
//      , new ThreadFactoryBuilder().setNamePrefix("Scheduler_").build()
  );
  static final ScheduledExecutorService esScheduleFixedRate = Executors.newScheduledThreadPool(2
//      , new ThreadFactoryBuilder().setNamePrefix("Scheduler_FixRate").build()
  );


  public static void main(String[] args) throws InterruptedException {
//    simpleMethod(esSingleThread);
//    simpleMethod(esFixedThreadPool);
//    simpleMethod(esCachedThreadPool);

//    esScheduleSingle.schedule(() -> {
//      System.out.println("ThreadName = " + Thread.currentThread().getName()
//          + " Time: " + System.currentTimeMillis());
//    }, 1, TimeUnit.SECONDS);
//
//    //does not expecting termination
//    esSchedule.scheduleAtFixedRate(() -> {
//      System.out.println("ThreadName = " + Thread.currentThread().getName()
//          + " Time: " + System.currentTimeMillis());
//    }, 5, 5, TimeUnit.SECONDS);
//
//    //expecting termination
//    esScheduleFixedRate.scheduleWithFixedDelay(() -> {
//      System.out.println("ThreadName = " + Thread.currentThread().getName()
//          + " Time: " + System.currentTimeMillis());
//    }, 5, 5, TimeUnit.SECONDS);

    Thread.sleep(20_000);
    System.exit(-1);
  }

  private static void simpleMethod(ExecutorService es) {
    for (int i = 0; i <= 10; i++) {
      es.execute(() -> {
        System.out.println("ThreadName = " + Thread.currentThread().getName());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignore) {
//          e.printStackTrace();
        }
      });
      try {
        Thread.sleep(1);
      } catch (InterruptedException ignore) {

      }
    }
    es.shutdownNow();
  }
}
