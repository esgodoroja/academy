package md.orange.academy.example.classes;

public abstract class AbstractClass {

  private final String CONSTANT = "Constant";

  protected String name;
  protected long creationTime;

  public AbstractClass(String name, long creationTime) {
    this.name = name;
    this.creationTime = creationTime;
  }

  public abstract float makeADiscountFromAbsMethod(float price);

  public float makeDiscount(float price) {
    return price * 0.1f;
  }
}
