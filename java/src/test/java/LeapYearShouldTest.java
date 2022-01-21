import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShouldTest {

	@Test
	public void is_not_a_leap_year_if_not_divisible_by_four() {
		assertTrue(LeapYear.isLeapYear(3));
	}

}
