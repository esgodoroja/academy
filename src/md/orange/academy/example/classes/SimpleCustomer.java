package md.orange.academy.example.classes;

public class SimpleCustomer extends AbstractClass {

  public SimpleCustomer(String name, long creationTime) {
    super(name, creationTime);
  }

  @Override
  public float makeADiscountFromAbsMethod(float price) {
    return makeDiscount(price);
  }
}
