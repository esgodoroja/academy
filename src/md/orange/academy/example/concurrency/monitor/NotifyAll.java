package md.orange.academy.example.concurrency.monitor;

public class NotifyAll {

  static class ClassA extends Thread {

    public void run() {
      synchronized (this) {
        System.out.println
            (Thread.currentThread().getName() + "...starts");
        try {
          this.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
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
        this.classA.notifyAll();
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
    Thread.sleep(100);
    thC.start();

  }
}
