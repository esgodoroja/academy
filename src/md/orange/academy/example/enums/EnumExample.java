package md.orange.academy.example.enums;

public enum EnumExample {
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY;

  public boolean isWeekend(EnumExample input) {
    return (input == SATURDAY || input == SUNDAY);
  }

  public static EnumExample getEnum(String input) {
    EnumExample result = MONDAY;
    for (EnumExample e: EnumExample.values()) {
      if(e.name().equals(input)) {
        result = e;
      }
    }
    return result;
  }
}
