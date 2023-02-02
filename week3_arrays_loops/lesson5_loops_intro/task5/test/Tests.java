import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Tests {

  @Test
  public void copyOfRangeOK() {
    int[] input = {1, 2, 3, 4, 5, 6};
    int start = 2;
    int end = 5;

    int[] actual = Task.copyOfRange(input, start, end);

    Assert.assertArrayEquals(Arrays.copyOfRange(input, start, end), actual);
  }

  @Test
  public void copyOfRangeStartEndInvalid() {
    int[] input = {1, 2, 3, 4, 5, 6};
    int start = 9;
    int end = 1;

    int[] actual = Task.copyOfRange(input, start, end);

    Assert.assertNull(actual);
  }

  @Test
  public void copyOfRangeNullInput() {
    Assert.assertNull(Task.copyOfRange(null, 0, 7));
  }

  @Test
  public void copyOfRangeEmptyArr() {
    Assert.assertNull(Task.copyOfRange(new int[0], 0, 7));
  }

  @Test
  public void eqOk() {
    boolean res = Task.eq(new int[]{1,2,3,4}, new int[]{1,2,3,4});
    Assert.assertTrue(res);
  }

  @Test
  public void eqNotEqualDiffSize() {
    boolean res = Task.eq(new int[]{1,2}, new int[]{1,2,3,4});
    Assert.assertFalse(res);
  }

  @Test
  public void eqNotEqualSameSize() {
    boolean res = Task.eq(new int[]{1,2,4,3}, new int[]{1,2,3,4});
    Assert.assertFalse(res);
  }

  @Test
  public void eqNull() {
    boolean res = Task.eq(null, null);
    Assert.assertTrue(res);
  }

  @Test
  public void eqEmptyArrays() {
    boolean res = Task.eq(new int[0], new int[0]);
    Assert.assertTrue(res);
  }

  @Test
  public void toStr(){
    int[] input = {1, 2, 3, 4, 5};
    String res = Task.toStr(input);
    Assert.assertEquals(Arrays.toString(input), res);
  }

  @Test
  public void toStrEmp(){
    int[] input = new int[0];
    String res = Task.toStr(input);
    Assert.assertEquals(Arrays.toString(input), res);
  }

  @Test
  public void toStrNull(){
    int[] input = null;
    String res = Task.toStr(input);
    Assert.assertEquals(Arrays.toString(input), res);
  }

  @Test
  public void reverseOk() {
    int[] res = Task.reverse(new int[]{1, 2, 3, 4});
    Assert.assertEquals(new int[]{4, 3, 2, 1}, res);
  }

}