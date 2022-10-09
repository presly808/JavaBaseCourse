import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class Tests extends OutputRedirectionParentTest {
  @Test
  public void testNoPower() {
    System.setIn(new ByteArrayInputStream("true 900".getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();
    String expected = "Not enough power\n";

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testNoElectricity() {
    System.setIn(new ByteArrayInputStream("false 1500".getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();
    String expected = "No electricity\n";

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testOkSolution() {
    System.setIn(new ByteArrayInputStream("true 1500".getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();
    String expected = "We are going to boil watter with cattle\n";

    Assert.assertEquals(expected, actual);
  }
}