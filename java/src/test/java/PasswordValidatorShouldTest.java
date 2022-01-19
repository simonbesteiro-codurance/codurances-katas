import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorShouldTest {

  @Test
  public void is_not_valid_when_password_is_less_than_eight_characters() {
    assertFalse(PasswordValidator.isValid("mypass"));
  }
}
