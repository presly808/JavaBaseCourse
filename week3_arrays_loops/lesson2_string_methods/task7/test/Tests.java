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
            {"  First,Second  ", new String[]{"First", "Second"}},
            {"", new String[0]},
            {null, new String[0]},
            {"One", new String[]{"One"}},
            {"   One     ", new String[]{"One"}},
    });
  }

  private String input;
  private String[] expected;

  public Tests(String input, String[] expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void testSolution() {
    Assert.assertArrayEquals(String.format("toStrArr(%s) -> %s", input, Arrays.toString(expected)),
            expected, Task.toStrArr(input));
  }

}