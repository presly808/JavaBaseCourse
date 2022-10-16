import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;

public class Tests extends OutputRedirectionParentTest {
  @Test
  public void testSolution() {
    // put your test here
    Task.main(new String[0]);

    String actual = baos.toString();
    String expected = "Time to walk" + System.getProperty("line.separator") +
            "Alone" + System.getProperty("line.separator") +
            "To the cinema" + System.getProperty("line.separator");

    Assert.assertEquals(expected, actual);
  }
}