public class PasswordValidator {
  public static boolean isValid(String password) {
    if(password.length() >= 8) {
      return true;
    }
    return false;
  }
}
