package md.orange.academy.example.classes;

public class VipCustomer extends AbstractClass {

  public VipCustomer(String name, long creationTime) {
    super(name, creationTime);
  }

  @Override
  public float makeADiscountFromAbsMethod(float price) {
    return price * 0.25f;
  }
}
