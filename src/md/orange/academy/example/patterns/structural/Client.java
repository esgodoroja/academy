package md.orange.academy.example.patterns.structural;

public class Client {

  private ITarget target;

  public Client(ITarget target) {
    this.target = target;
  }

  public void performAction() {
    target.performAction();
  }
}
