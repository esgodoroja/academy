package md.orange.academy.example.patterns.structural;

public class Demo {

  public static void main(String[] args) {
    ITarget adapter = new Adapter();
    Client client = new Client(adapter);
    client.performAction();
  }
}
