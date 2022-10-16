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
            {"Bogdan", 78, 85, 2000, 5000, "You will reach the target in 26 days"},
            // In this case, a person wants to gain weight, but his/her food ratio is about to lose weight
            {"Oleg", 78, 85, 3000, 2000, "You are losing weight"},
            {"Olesia", 60, 50, 2000, 1500, "You will reach the target in 38 days"},
            // In this case, a person wants to lose weight, but his/her ration is about to gain weight
            {"Ivanka", 55, 45, 1000, 3000, "You are gaining weight"},
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

    expected =  expected + expectedMessage + System.getProperty("line.separator");

    Assert.assertEquals(expected, actual);
  }
}