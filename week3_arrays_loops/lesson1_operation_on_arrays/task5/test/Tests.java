import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Tests {

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            {new int[]{8,8,8,8,8,0,0}, 20, 800},
            {new int[]{8,8,8,8,0,0,0}, 20, 640},
            {new int[]{1,1,1,1,1,0,0}, 50, 250},
            {new int[]{1,1,1,1,1,0,0}, -56, -1},
            {new int[]{1,1,1,1,1,0}, 10, -1},
            {new int[]{1,1,1,1,1,1,1}, 10, 70},
    });
  }

  int[] weekHours;
  int hourRate;
  int result;

  public Tests(int[] weekHours, int hourRate, int result) {
    this.weekHours = weekHours;
    this.hourRate = hourRate;
    this.result = result;
  }

  @Test
  public void testSolution() {
    Assert.assertEquals(result, Task.calculateSalary(weekHours, hourRate));
  }
}