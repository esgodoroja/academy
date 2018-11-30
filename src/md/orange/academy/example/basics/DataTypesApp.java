package md.orange.academy.example.basics;

public class DataTypesApp {

  private static DataTypesApp test;
  /**
   * Primitive Data Types.
   *
   */

//  Boolean
  private static boolean simpleBoolean;
  private static Boolean aBoolean;
//  Numeric
//    Integer
  private static byte simpleByte;
  private static Byte aByte;

  private static int simpleInt;
  private static Integer anInt;
  private static short simpleShort;
  private static Short aShort;
//    Character
  private static char simpleChar;
  private static Character aChar;
//    Floating-point
  private static float simpleFloat;
  private static Float aFloat;

  private static double simpleDouble;
  private static Double aDouble;

  public static void main(String... arg) {
    DataTypesApp app = new DataTypesApp();
//    app.printDefaultValues();
//    app.printObjects();
    simpleInt = 245;
    simpleShort = (short) simpleInt;

    System.out.println("simpleShort = " + simpleShort);
  }

  private void printDefaultValues() {
    System.out.println("simpleBoolean = " + simpleBoolean);
    System.out.println("simpleByte = " + simpleByte);
    System.out.println("simpleInt = " + simpleInt);
    System.out.println("simpleShort = " + simpleShort);
    System.out.println("simpleChar = " + simpleChar);
    System.out.println("simpleFloat = " + simpleFloat);
    System.out.println("simpleDouble = " + simpleDouble);
  }

  private static void printObjects() {
    System.out.println("aBoolean = " + aBoolean);
    System.out.println("aByte = " + aByte);
    System.out.println("anInt = " + anInt);
    System.out.println("aShort = " + aShort);
    System.out.println("aChar = " + aChar);
    System.out.println("aFloat = " + aFloat);
    System.out.println("aDouble = " + aDouble);
  }



}
