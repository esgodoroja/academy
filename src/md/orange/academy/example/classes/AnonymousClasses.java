package md.orange.academy.example.classes;

public class AnonymousClasses {

  public void aMethod(/*some inputs*/) {
//    Non Anonymous Class example
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
      }
    };

    Thread th1 = new Thread(runnable);

    th1.start();

//     Anonymous Class example
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
      }
    }).start();
  }
}
