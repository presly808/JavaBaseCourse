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

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            // TODO add more test cases
            { 20, 3, 20, 4, 1, "Kyiv", "Your ticket to Kyiv on 20/4 costs 270\n"},
    });
  }

  int currentDay;
  int currentMonth;
  int flightDay;
  int flightMonth;
  int weekDay;
  String destination;
  String expectedMessage;

  public Tests(int currentDay, int currentMonth, int flightDay, int flightMonth,
               int weekDay, String destination, String expectedMessage) {
    this.currentDay = currentDay;
    this.currentMonth = currentMonth;
    this.flightDay = flightDay;
    this.flightMonth = flightMonth;
    this.weekDay = weekDay;
    this.destination = destination;
    this.expectedMessage = expectedMessage;
  }

  @Test
  public void testAll() {
    // put your test here
    System.setIn(new ByteArrayInputStream(String.format("%s %s %s %s %s %s",
            currentDay, currentMonth, flightDay, flightMonth, weekDay, destination).getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();

    Assert.assertEquals(expectedMessage, actual);
  }
}