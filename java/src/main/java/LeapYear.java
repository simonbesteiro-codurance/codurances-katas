public class LeapYear {

  public static boolean isLeapYear(int year) {

    if (isModuleOf(year, 100) && isNotModuleOf(year, 400)) return false;
    if (isModuleOf(year, 4)) return true;
    return false;

  }

  private static boolean isModuleOf(int checkedNumber, int base) {
    return checkedNumber % base == 0;
  }

  private static boolean isNotModuleOf(int checkedNumber, int base) {
    return checkedNumber % base != 0;
  }

}
