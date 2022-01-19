import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorShouldTest {

  @Test
  public void is_not_valid_when_password_is_less_than_eight_characters() {
    assertFalse(PasswordValidator.isValid("mypass"));
  }

  @Test
  public void is_not_valid_when_password_does_not_contains_an_uppercase_character() {
    assertFalse(PasswordValidator.isValid("mypassword"));
  }
  @Test
  public void is_not_valid_when_password_does_not_contains_a_lower_character() {
    assertFalse(PasswordValidator.isValid("MYPASSWORD"));
  }

  @Test
  public void is_not_valid_when_password_does_not_contains_a_number() {
    assertFalse(PasswordValidator.isValid("Mypassword"));
  }

  @Test
  public void is_not_valid_when_password_does_not_contains_an_underscore() {
    assertFalse(PasswordValidator.isValid("Mypassword9"));
  }
  @Test
  public void is_not_valid_when_password_does_not_starts_with_a_capital_character() {
    assertFalse(PasswordValidator.isValid("mYpassword9_"));
  }

  @Test
  public void is_valid_when_password_given_fullfilled_all_requirements() {
    assertTrue(PasswordValidator.isValid("MYpassword9_"));
  }

}
