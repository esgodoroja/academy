package md.orange.academy.example.concurrency.sync.idioms;

class MethodExample {
  private int counter;

  synchronized void increment(){
    counter++;
  }

  synchronized void increment(int input){
    counter+=input;
  }
  synchronized void decrement(){
    counter--;
  }
  synchronized void decrement(int input){
    counter-=input;
  }

  synchronized int getCounter() {
    return counter;
  }


}
