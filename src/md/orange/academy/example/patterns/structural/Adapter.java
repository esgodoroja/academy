package md.orange.academy.example.patterns.structural;

public class Adapter implements ITarget {

  private ExternalLibrary externalLibrary = new ExternalLibrary();

  @Override
  public void performAction() {
    externalLibrary.performAction();
  }
}
