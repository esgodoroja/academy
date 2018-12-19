package md.orange.academy.example.concurrency.monitor;

public class Notify {

  static class ClassA extends Thread {

    public void run() {
      synchronized (this) {
        System.out.println
            (Thread.currentThread().getName() + "...starts");
        try {
          //wait until either another thread invoices notify()
          this.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        this.notify();
        System.out.println
            (Thread.currentThread().getName() + "...notified");
      }
    }
  }

  static class ClassB extends Thread {
    ClassA classA;
    ClassB(ClassA classA) {
      this.classA = classA;
    }

    public void run() {
      synchronized (this.classA) {
        System.out.println
            (Thread.currentThread().getName() + "...starts");
        try {
          //wait until either another thread invoices notify()
          this.classA.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println
            (Thread.currentThread().getName() + "...notified");
      }
    }
  }

  static class ClassC extends Thread {
    ClassA classA;
    ClassC(ClassA classA) {
      this.classA = classA;
    }
    public void run() {
      synchronized (this.classA) {
        System.out.println
            (Thread.currentThread().getName() + "...starts");
        //wakes up a single thread that is waiting on this object's monitor
        this.classA.notify();
        System.out.println
            (Thread.currentThread().getName() + "...notified");
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ClassA classA = new ClassA();
    ClassB classB = new ClassB(classA);
    ClassC classC = new ClassC(classA);

    Thread thA = new Thread(classA, "Thread-A");
    Thread thB = new Thread(classB, "Thread-B");
    Thread thC = new Thread(classC, "Thread-C");

    thA.start();
    thB.start();
    Thread.sleep(5000);
    thC.start();
  }
}
