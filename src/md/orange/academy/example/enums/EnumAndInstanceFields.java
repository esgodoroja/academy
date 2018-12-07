package md.orange.academy.example.enums;

public enum EnumAndInstanceFields {
  MONDAY(false),
  TUESDAY(false),
  WEDNESDAY(false),
  THURSDAY(false),
  FRIDAY(false),
  SATURDAY(true),
  SUNDAY(true);

  private final boolean isWeekend;

  EnumAndInstanceFields(final boolean isWeekend) {
    this.isWeekend = isWeekend;
  }

  public boolean isWeekend() {
    return isWeekend;
  }
}
