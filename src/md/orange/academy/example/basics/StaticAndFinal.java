package md.orange.academy.example.basics;

public class StaticAndFinal {

  private String CONSTANT = "Constant";

  static String Shared = "No need to initialize class";

  static void PrintStaticVar() {
    System.out.println("Shared = " + Shared);
  }

  public String getCONSTANT() {
    return CONSTANT;
  }

  public void setCONSTANT(String CONSTANT) {
    this.CONSTANT = CONSTANT;
  }
}
