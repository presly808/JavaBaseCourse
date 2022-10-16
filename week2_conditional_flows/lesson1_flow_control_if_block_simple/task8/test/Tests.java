import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class Tests extends OutputRedirectionParentTest {

  @Test
  public void test0() {

    String heartRate = "-2";
    System.setIn(new ByteArrayInputStream(heartRate.getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();

    Assert.assertEquals("Invalid input data" + System.getProperty("line.separator") + "heartBeatsPerMinute = " + heartRate, actual);
  }

  @Test
  public void test1() {

    String heartRate = "50";
    System.setIn(new ByteArrayInputStream(heartRate.getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();

    Assert.assertEquals("Are you sleeping? You heart rate is low" + System.getProperty("line.separator") + "heartBeatsPerMinute = " + heartRate, actual);
  }

  @Test
  public void test2() {
    // put your test here
    String heartRate = "79";
    System.setIn(new ByteArrayInputStream(heartRate.getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();

    Assert.assertEquals("Your heart rate is in normal zone" + System.getProperty("line.separator")
            + "heartBeatsPerMinute = " + heartRate, actual);
  }

  @Test
  public void test3() {
    String heartRate = "110";
    System.setIn(new ByteArrayInputStream(heartRate.getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();

    Assert.assertEquals("Be accurate while doing exercises" + System.getProperty("line.separator")
            + "heartBeatsPerMinute = " + heartRate, actual);
  }
}