package md.orange.academy.example.classes;

public class AbstractApp {

  public static void main(String[] agrs) throws InterruptedException {
    VipCustomer vip = new VipCustomer("Ion", System.currentTimeMillis());
    Thread.sleep(1000);

    SimpleCustomer simple = new SimpleCustomer("Victor", System.currentTimeMillis());

    System.out.println("Vip Name: " + vip.name + " makeDiscount = " + vip.makeADiscountFromAbsMethod(100f));
    System.out.println("Simple Name: " + simple.name + " makeDiscount = " + simple.makeADiscountFromAbsMethod(100f));


  }
}
