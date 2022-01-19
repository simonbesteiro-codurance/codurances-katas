public class PasswordValidator {
  private static final int MIN_CHARACTERS = 8;

  public static boolean isValid(String password) {
    boolean hasLowercase = false;
    boolean hasUppercase = false;
    boolean hasNumber = false;

    for (int i = 0; i < password.length(); i++) {
      if(!hasUppercase) hasUppercase = isHasUppercase(password.charAt(i));
      if(!hasLowercase) hasLowercase = isHasLowercase(password.charAt(i));
      if(!hasNumber) hasNumber = isNumber(password.charAt(i));

    }
    return hasLowercase
      && hasUppercase
      && hasMoreThanEightCharacters(password)
      && hasNumber
      && hasUnderscore(password)
      && hasFirstCharAsCapitalLetter(password);
  }

  private static boolean isHasUppercase(char character) {
    return Character.isUpperCase(character);
  }

  private static boolean isHasLowercase(char character) {
    return Character.isLowerCase(character);
  }

  private static boolean isNumber(char character) {
    return Character.isDigit(character);
  }

  private static boolean hasMoreThanEightCharacters(String password) {
    return password.length() >= MIN_CHARACTERS;
  }

  private static boolean hasUnderscore(String password) {
    return password.contains("_");
  }

  private static boolean hasFirstCharAsCapitalLetter(String password) {
    return Character.isUpperCase(password.charAt(0));
  }
}

