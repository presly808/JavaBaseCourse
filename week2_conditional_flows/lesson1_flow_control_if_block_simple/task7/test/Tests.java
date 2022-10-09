import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class Tests extends OutputRedirectionParentTest {

  @Test
  public void test1() {

    String heartRate = "-2";
    System.setIn(new ByteArrayInputStream(heartRate.getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();

    Assert.assertEquals("Heart rate is not normal\nheartBeatsPerMinute = " + heartRate, actual);
  }

  @Test
  public void test2() {
    // put your test here
    String heartRate = "79";
    System.setIn(new ByteArrayInputStream(heartRate.getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();

    Assert.assertEquals("Your heart rate is in normal zone\nheartBeatsPerMinute = " + heartRate, actual);
  }

  @Test
  public void test3() {
    String heartRate = "110";
    System.setIn(new ByteArrayInputStream(heartRate.getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();

    Assert.assertEquals("Heart rate is not normal\nheartBeatsPerMinute = " + heartRate, actual);
  }
}