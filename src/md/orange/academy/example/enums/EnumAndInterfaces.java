package md.orange.academy.example.enums;

/**
 * simple interface DayOfWeek
 *
 */
public class EnumAndInterfaces {


  interface DayOfWeek {

    boolean isWeekend();
  }

  enum EnumExample implements DayOfWeek {
    MONDAY() {
      @Override
      public boolean isWeekend() {
        return false;
      }
    },
    TUESDAY() {
      @Override
      public boolean isWeekend() {
        return false;
      }
    },
    SUNDAY() {
      @Override
      public boolean isWeekend() {
        return true;
      }
    }
  }

  enum EnumSingleMethodExample implements DayOfWeek {
    MONDAY(false), TUESDAY(false), SUNDAY(true);

    private final boolean isWeekend;

    EnumSingleMethodExample(final boolean isWeekend) {
      this.isWeekend = isWeekend;
    }

    @Override
    public boolean isWeekend() {
      return false;
    }
  }
}
