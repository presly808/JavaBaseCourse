import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Tests {
  @Test
  public void testNegativeSize() {
    String actual = Task.createStrArray(-1, 10);
    Assert.assertNull("Should return null if validation fails", actual);
  }

  @Test
  public void testFillerNotInRangeHigher() {
    String actual = Task.createStrArray(2, 10);
    Assert.assertNull("Should return null if validation fails", actual);
  }

  @Test
  public void testFillerNotInRangeLower() {
    String actual = Task.createStrArray(2, -2);
    Assert.assertNull("Should return null if validation fails", actual);
  }

  @Test
  public void testPositiveCase() {
    String actual = Task.createStrArray(3, 3);
    Assert.assertEquals(Arrays.toString(new int[] {3,3,3}), actual);
  }

  @Test
  public void testPositiveCase2() {
    String actual = Task.createStrArray(2, 7);
    Assert.assertEquals(Arrays.toString(new int[] {7, 7}), actual);
  }
}