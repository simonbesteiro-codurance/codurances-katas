import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShouldTest {

	@Test
	public void is_not_a_leap_year_if_not_divisible_by_four() {
		assertFalse(LeapYear.isLeapYear(3));
	}

  @Test
  public void is_a_leap_year_if_not_divisible_by_four() {
    assertTrue(LeapYear.isLeapYear(4));
  }

  @Test
  public void is_a_leap_year_if_not_divisible_by_four_hundred() {
    assertTrue(LeapYear.isLeapYear(400));
  }

  @Test
  public void is_not_a_leap_year_if_divisible_by_one_Hundred_and_not_four_hundred() {
    assertFalse(LeapYear.isLeapYear(1300));
  }

  @Test
  public void is_not_a_leap_year_1997() {
    assertFalse(LeapYear.isLeapYear(1997));
  }

  @Test
  public void is_a_leap_year_1996() {
    assertTrue(LeapYear.isLeapYear(1996));
  }
}
