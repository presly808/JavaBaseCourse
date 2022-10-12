import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class Tests extends OutputRedirectionParentTest {
  @Test
  public void testSolution1() {
    System.setIn(new ByteArrayInputStream("50 10".getBytes()));

    Task.main(new String[0]);

    Assert.assertEquals("50 * 10 = 500", baos.toString());
  }

  @Test
  public void testSolution2() {
    System.setIn(new ByteArrayInputStream("3 7".getBytes()));

    Task.main(new String[0]);

    Assert.assertEquals("3 * 7 = 21", baos.toString());
  }
}