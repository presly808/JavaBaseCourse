import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Tests {
  @Test
  public void testPositive1() {
    double[] doubles1 = {10.2, -2.33, 8.9, 34, -8};
    double[] doubles2 = {8.9, -2.33, 34, -8, 10.2};
    Assert.assertTrue(Task.equalsAfterSorting(doubles1, doubles2));
  }

  @Test
  public void testPositive2() {
    double[] doubles1 = {10.2, -2.33, 8.9, 34, -8};
    double[] doubles2 = {8.9, -2.33, 34, -8, 10.2};
    Arrays.sort(doubles2);
    Assert.assertTrue(Task.equalsAfterSorting(doubles1, doubles2));
  }

  @Test
  public void testNullArrays() {
    double[] doubles1 = null;
    double[] doubles2 = null;
    Assert.assertFalse(Task.equalsAfterSorting(doubles1, doubles2));
  }

  @Test
  public void testEmptyArrays() {
    double[] doubles1 = new double[0];
    double[] doubles2 = new double[0];
    Assert.assertTrue(Task.equalsAfterSorting(doubles1, doubles2));
  }

  @Test
  public void testNotEqual() {
    double[] doubles1 = new double[]{1,2,3};
    double[] doubles2 = new double[]{2,2,2};
    Assert.assertFalse(Task.equalsAfterSorting(doubles1, doubles2));
  }
}