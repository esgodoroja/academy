package md.orange.academy.example.concurrency.pools;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

    private ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 1L, TimeUnit.SECONDS,
      new ArrayBlockingQueue<>(10));
//  ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 1L, TimeUnit.SECONDS,
//      new ArrayBlockingQueue<>(50), new ThreadFactoryBuilder().setNamePrefix("Prefix_01").build(),
//      new RejectedExecutionHandler() {
//        @Override
//        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
//          System.out.println("thread was rejected = " + r.toString());
//        }
//      });


  public static void main(String[] args) throws InterruptedException {
    ThreadPoolExecutorExample example = new ThreadPoolExecutorExample();
    for (int i = 0; i <= 10; i++) {
      example.executor.execute(() -> {
        System.out.println("example = " + example);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignore) {
//          e.printStackTrace();
        }
      });
      Thread.sleep(1);
    }

    System.out.println(" done ");
    example.executor.shutdown();
//    example.executor.shutdownNow().stream().forEach(e -> {
//      System.out.println("e = " + e);
//    });

    System.out.println("example.executor.isShutdown() = " + example.executor.isShutdown());
    System.out.println("example.executor.isTerminated() = " + example.executor.isTerminated());
    System.out.println("example.executor.isTerminating() = " + example.executor.isTerminating());
  }
}
