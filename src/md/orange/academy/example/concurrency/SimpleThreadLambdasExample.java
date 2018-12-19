package md.orange.academy.example.concurrency;

public class SimpleThreadLambdasExample {

  public static void main(String[] args) {

    Thread th1 = new Thread(() -> System.out.println("th1"));

    Thread th2 = new Thread(() -> System.out.println("th2"));
    Thread th3 = new Thread(() -> System.out.println("th3"));

    th1.start();
    th2.start();
    th3.start();

  }
}
