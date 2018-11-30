package md.orange.academy.example.basics;

public class StaticAndFinalApp {

  public static void main(String... args) {
    StaticAndFinal.PrintStaticVar();
    StaticAndFinal staticAndFinal = new StaticAndFinal();
    System.out.println("staticAndFinal.getCONSTANT() = " + staticAndFinal.getCONSTANT());
  }
}
