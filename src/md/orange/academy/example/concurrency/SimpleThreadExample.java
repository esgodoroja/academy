package md.orange.academy.example.concurrency;

public class SimpleThreadExample {

  static class Simple implements Runnable {

    @Override
    public void run() {
      System.out.println("Hello from implementation");
    }
  }

  static class HelloFromThread extends Thread {

    @Override
    public void run() {
      System.out.println("Hello from extends");
    }
  }

  public static void main(String[] args) {

    Simple simple = new Simple();
    Thread thread = new HelloFromThread();

//    SimpleThreadExample$HelloFromThread
//    SimpleThreadExample$Simple.class
//    SimpleThreadExample
//    SimpleThreadExample$1
    simple.run();
    thread.start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("some logic");
      }
    }).start();
  }
}
