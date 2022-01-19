public class PasswordValidator {
  public static boolean isValid(String password) {
    boolean hasLowercase = false;
    boolean hasUppercase = false;
    boolean hasNumber = false;

    for (int i = 0; i < password.length(); i++) {
      if(!hasUppercase) hasUppercase = isHasUppercase(password.charAt(i));
      if(!hasLowercase) hasLowercase = isHasLowercase(password.charAt(i));
      if(!hasNumber) hasNumber = isNumber(password.charAt(i));

    }
    return false;
  }
}
