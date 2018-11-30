package md.orange.academy.example.classes;

public abstract class SimpleAbstractClass {
  public int anInt;

  public SimpleAbstractClass(int anInt) {
    this.anInt = anInt;
  }

  public void performsAction() {
    // some action here
  }

  public abstract void performsChildAction();
}
