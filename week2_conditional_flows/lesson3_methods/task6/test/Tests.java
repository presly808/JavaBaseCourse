import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Tests extends OutputRedirectionParentTest {
  @Test
  public void testIfCustomMethodPresent() {

    long count =
            Arrays.stream(Task.class.getMethods())
                    .map(Method::toGenericString)
                    .filter(el -> el.contains("static") && !el.contains("main"))
                    .count();

    Assert.assertEquals("Your custom method not found", 1, count);


  }

  @Test
  public void testMalePerfectWeight() {
    System.setIn(new ByteArrayInputStream("187 true".getBytes()));

    Task.main(new String[0]);

    Assert.assertEquals("Your perfect weight in pounds is 220", baos.toString());
  }

  @Test
  public void testFemalePerfectWeight() {
    System.setIn(new ByteArrayInputStream("160 false".getBytes()));

    Task.main(new String[0]);

    Assert.assertEquals("Your perfect weight in pounds is 126", baos.toString());
  }

  @Test
  public void testInputDataValidation() {
    System.setIn(new ByteArrayInputStream("-2 false".getBytes()));

    Task.main(new String[0]);

    Assert.assertEquals("Height can no be negative" + System.getProperty("line.separator"), baos.toString());
  }
}