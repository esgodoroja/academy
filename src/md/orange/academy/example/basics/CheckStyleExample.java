package md.orange.academy.example.basics;

/**
 * please use some check style plugin: This plugin {CheckStyle-IDEA}.
 * use existing best practise recommendations from SUN or GOOGLE.
 *  Check style for GOOGLE - https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml
 */
public class CheckStyleExample {

  private static final String CONSTANT_EXAMPLE = "Some Constant";

  public static void main(String[] args) {
    double anInt = 9;
    double secondInt = 2;
    double result = anInt / secondInt;

    System.out.println("r = " + result);
    if (result > 0) {
      System.out.println(" some text");
    } else {
      System.out.println(" some another text");
    }

    MethodOne(1, 1f);

  }

  /**
   * Small summary of the method
   * @param anInt - describe the field
   * @param anFloat - describe the field
   * @throws NoSuchFieldError - reasons why it can happens
   */
  private static void MethodOne(int anInt, float anFloat) throws NoSuchFieldError{
    // code here inheritance

  }
}
