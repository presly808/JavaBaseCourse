import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;

public class Tests extends OutputRedirectionParentTest {
  @Test
  public void testSolution() {
    // put your test here
    Task.main(new String[0]);

    String actual = baos.toString();
    String expected = "Time to walk\n" +
            "Alone\n" +
            "To the cinema\n";

    Assert.assertEquals(expected, actual);
  }
}