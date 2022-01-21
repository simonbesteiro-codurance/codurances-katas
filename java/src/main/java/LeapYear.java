public class LeapYear {
  public static boolean isLeapYear(int year) {
    if (isNotModuleOf(year, 4)) return false;
    else if (isNotModuleOf(year, 100)) return true;
    else if (isNotModuleOf(year, 400)) return false;
    return true;
  }

  private static boolean isNotModuleOf(int checkedNumber, int base) {
    return checkedNumber % base != 0;
  }

}
