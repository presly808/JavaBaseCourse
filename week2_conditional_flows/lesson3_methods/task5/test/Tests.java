import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class Tests extends OutputRedirectionParentTest {
  @Test
  public void testSolution1() {
    System.setIn(new ByteArrayInputStream("50 10 90".getBytes()));

    Task.main(new String[0]);

    Assert.assertEquals("Max number is 90" + System.getProperty("line.separator"), baos.toString());
  }

  @Test
  public void testSolution2() {
    System.setIn(new ByteArrayInputStream("3 7 -2".getBytes()));

    Task.main(new String[0]);

    Assert.assertEquals("Max number is 7" + System.getProperty("line.separator"), baos.toString());
  }

  @Test
  public void testSolution3() {
    System.setIn(new ByteArrayInputStream("10 7 -2".getBytes()));

    Task.main(new String[0]);

    Assert.assertEquals("Max number is 10" + System.getProperty("line.separator"), baos.toString());
  }
}