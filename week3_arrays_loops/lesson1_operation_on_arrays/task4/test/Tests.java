import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testPasswordOk() {
    // put your test here
    char[] guess = "1234qwer".toCharArray();
    Assert.assertTrue(Task.checkPassword(guess, guess));
  }

  @Test
  public void testWrongPass() {
    // put your test here
    char[] guess = "1234qwer".toCharArray();
    Assert.assertFalse(Task.checkPassword(guess, "4321rewq".toCharArray()));
  }

  @Test
  public void testPassWrongLength() {
    // put your test here
    char[] guess = "1234qwer".toCharArray();
    Assert.assertFalse(Task.checkPassword(guess, "2".toCharArray()));
  }
}