package md.orange.academy.example.concurrency.pools;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Daemon Thread - thread is a low priority thread that runs in background to perform tasks such as
 * garbage collection
 */
public class ThreadFactoryBuilder {

  private String namePrefix = null;
  private boolean daemon = false;
  private int priority = Thread.NORM_PRIORITY;

  public ThreadFactoryBuilder setNamePrefix(String namePrefix) {
    if (namePrefix == null) {
      throw new NullPointerException();
    }
    this.namePrefix = namePrefix;
    return this;
  }

  public ThreadFactoryBuilder setDaemon(boolean daemon) {
    this.daemon = daemon;
    return this;
  }

  public ThreadFactoryBuilder setPriority(int priority) {
    if (priority < Thread.MIN_PRIORITY) {
      throw new IllegalArgumentException(String.format(
          "Thread priority (%s) must be >= %s", priority,
          Thread.MIN_PRIORITY));
    }

    if (priority > Thread.MAX_PRIORITY) {
      throw new IllegalArgumentException(String.format(
          "Thread priority (%s) must be <= %s", priority,
          Thread.MAX_PRIORITY));
    }

    this.priority = priority;
    return this;
  }

  public ThreadFactory build() {
    return build(this);
  }

  private static ThreadFactory build(ThreadFactoryBuilder builder) {
    final String namePrefix = builder.namePrefix;
    final Boolean daemon = builder.daemon;
    final Integer priority = builder.priority;
    final ThreadFactory backingThreadFactory = Executors.defaultThreadFactory();

    final AtomicLong count = new AtomicLong(0);

    return new ThreadFactory() {
      @Override
      public Thread newThread(Runnable runnable) {
        Thread thread = backingThreadFactory.newThread(runnable);
        if (namePrefix != null) {
          thread.setName(namePrefix + "-" + count.getAndIncrement());
        }
        if (daemon != null) {
          thread.setDaemon(daemon);
        }
        if (priority != null) {
          thread.setPriority(priority);
        }

        return thread;
      }
    };
  }
}
