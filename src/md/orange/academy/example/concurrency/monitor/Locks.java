package md.orange.academy.example.concurrency.monitor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Locks {

  private ReentrantLock lock = new ReentrantLock();
  private Map<String, String> map = new HashMap<>();
  private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
  private int count;

  void increment() {
    lock.lock();
    try {
      count++;
    } finally {
      lock.unlock();
    }
  }

  void decrement() {
    lock.lock();
    try {
      count--;
    } finally {
      lock.unlock();
    }
  }

  void simpleBenefits() {
    new Thread(() -> {
      lock.lock();
      try {
        Thread.sleep(5);
      } catch (InterruptedException ignore) {

      } finally {
        lock.unlock();
      }
    }).start();

    new Thread(() -> {
      System.out.println("Locked: " + lock.isLocked());
      System.out.println("Held by me: " + lock.isHeldByCurrentThread());
      boolean locked = lock.tryLock();
      System.out.println("Lock acquired: " + locked);
    }).start();
  }

  void readWriteLock() {
    new Thread(() -> {
      readWriteLock.writeLock().lock();
      try {
        // only one writer can enter this section,
        // and only if no threads are currently reading.
        Thread.sleep(1);
        map.put("foo", "bar");
      } catch (InterruptedException ignore) {

      } finally {
        readWriteLock.writeLock().unlock();
      }
    }).start();

    new Thread(() -> {
      readWriteLock.readLock().lock();
      try {
        // multiple readers can enter this section
        // if not locked for writing, and not writers waiting
        // to lock for writing.
        System.out.println("map = " + map.get("foo"));
        Thread.sleep(1);
      } catch (InterruptedException ignore) {

      } finally {
        readWriteLock.readLock().unlock();
      }
    }).start();


  }
}
