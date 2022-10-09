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
            {"Bogdan", 78, 85, 5000, 2000, "You will reach the target in 10 days"},
            {"Oleg", 78, 85, 2000, 3000, "You are loosing weight"},
            {"Olesia", 60, 50, 1500, 2000, "You will reach the target in 51 days"},
            {"Ivanka", 55, 45, 3000, 1000, "You are gaining weight"},
    });
  }

  String name;
  int currentWeight;
  int desiredWeight;
  int caloriesBurnPerDay;
  int caloriesEatenPerDay;
  String expectedMessage;

  public Tests(String name, int currentWeight, int desiredWeight, int caloriesBurnPerDay, int caloriesEatenPerDay,
                String expectedMessage) {
    this.name = name;
    this.currentWeight = currentWeight;
    this.desiredWeight = desiredWeight;
    this.caloriesBurnPerDay = caloriesBurnPerDay;
    this.caloriesEatenPerDay = caloriesEatenPerDay;
    this.expectedMessage = expectedMessage;
  }

  @Test
  public void testAll() {

    System.setIn(new ByteArrayInputStream(
            String.format("%s %s %s %s %s",
                    name, currentWeight, desiredWeight, caloriesBurnPerDay, caloriesEatenPerDay)
                    .getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();
    String expected = String.format("Input data. " +
                    "Name %s, currentWeight %s, desiredWeight %s, caloriesBurnPerDay %s, caloriesEatenPerDay %s\n",
            name, currentWeight, desiredWeight, caloriesBurnPerDay, caloriesEatenPerDay);

    expected =  expected + expectedMessage + "\n";

    Assert.assertEquals(expected, actual);
  }
}