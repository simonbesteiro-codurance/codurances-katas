public class LeapYear {
  public static boolean isLeapYear(int year) {
    if (isModuleOf(year, 4)) return false;
    else if (isModuleOf(year, 100)) return true;
    else if (isModuleOf(year, 400)) return false;
    return true;
  }

  private static boolean isModuleOf(int year, int base) {
    return year % base != 0;
  }

}
