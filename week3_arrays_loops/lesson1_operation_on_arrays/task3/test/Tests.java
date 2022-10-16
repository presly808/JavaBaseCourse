import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Tests extends OutputRedirectionParentTest {

  // {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            {31, 1, "Date is valid true"},
            {28, 2, "Date is valid true"},
            {1, 3, "Date is valid true"},
            {0, 4, "Date is valid false"},
            {40, 1, "Date is valid false"},
            {20, 15, "Date is valid false"},
            {20, -1, "Date is valid false"},
    });
  }

  int day;
  int month;
  String result;

  public Tests(int day, int month, String result) {
    this.day = day;
    this.month = month;
    this.result = result;
  }

  @Test
  public void testSolution() {
    System.setIn(new ByteArrayInputStream(String.format("%s %s", day, month).getBytes()));

    Task.main(new String[]{});

    Assert.assertEquals(result, baos.toString());
  }
}