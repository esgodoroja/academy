package md.orange.academy.example.collections.list.examples;

import java.util.Vector;

public class VectorExample {

  public static void main(String[] args) {
    // create default vector
    Vector v = new Vector();

    v.add(1);
    v.add(2);
//    v.add("Can i add this?");
    v.add("May be yes, may be no=)");
    v.add(3);

    System.out.println("Vector is " + v);

    System.out.println("v.capacity() = " + v.capacity());
    System.out.println("v.remove Object = " + v.remove("Can i add this?"));
    System.out.println("v.remove() = " + v.remove(2));
    System.out.println("Vector after removing is " + v);

    v.add(0, "New First Element");

    System.out.println("get first Element = " + v.get(0));
  }
}
