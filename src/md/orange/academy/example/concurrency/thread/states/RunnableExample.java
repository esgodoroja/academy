package md.orange.academy.example.concurrency.thread.states;

public class RunnableExample {
  public static void main(String[] args) {
    Runnable runnable = () -> {
      // some code here;
    };

    Thread thread = new Thread(runnable);
    thread.start();
    System.out.println("thread.getState() = " + thread.getState());
  }

}
