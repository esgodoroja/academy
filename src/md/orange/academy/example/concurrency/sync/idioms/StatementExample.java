package md.orange.academy.example.concurrency.sync.idioms;

public class StatementExample {
  private int counter;

  private final Object object = new Object();

  public void increment(){
    synchronized (object) {
      counter++;
    }
  }

  public void increment(int input){
    counter+=input;
  }
  public void decrement(){
    counter--;
  }
  public void decrement(int input){
    counter-=input;
  }

  public int getCounter() {
    return counter;
  }


}
