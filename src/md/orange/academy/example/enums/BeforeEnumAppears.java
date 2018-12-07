package md.orange.academy.example.enums;

public class BeforeEnumAppears {

  public static final int MONDAY = 0;
  public static final int TUESDAY = 1;
  public static final int WEDNESDAY = 2;
  public static final int THURSDAY = 3;
  public static final int FRIDAY = 4;
  public static final int SATURDAY = 5;
  public static final int SUNDAY = 6;

  public static boolean ifWeekend(int input) {
    return (input == SATURDAY || input == SUNDAY);
  }

}
