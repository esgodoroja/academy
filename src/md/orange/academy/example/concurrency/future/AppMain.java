package md.orange.academy.example.concurrency.future;

import java.util.concurrent.Callable;

public class AppMain {

  public static void main(String[] args) throws Exception {
    Callable callable = new CallableExample();
    System.out.println("callable.call() = " + callable.call());
    System.out.println("callable.call() = " + callable.call());
    System.out.println("callable.call() = " + callable.call());
    System.out.println("callable.call() = " + callable.call());
  }
}
