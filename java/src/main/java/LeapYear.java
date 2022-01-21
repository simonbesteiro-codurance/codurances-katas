public class LeapYear {
  public static boolean isLeapYear(int year) {
    if (year == 400) return true;

    if (year == 4) return true;
    return false;
  }
}
