import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorShouldTest {

	@Test
	public void is_valid_when_password_is_more_than_eight_characters() {
		assertTrue(PasswordValidator.isValid("mypasswrod"));
	}

}
