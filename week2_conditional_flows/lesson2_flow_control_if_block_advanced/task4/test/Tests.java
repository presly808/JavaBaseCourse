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
            { 21, 3, "Oleg", "Aries"},
            { 31, 3, "Oleg", "Aries"},
            { 20, 4, "Tania", "Aries"},

            { 21, 4, "Olha", "Taurus"},
            { 30, 4, "Olha", "Taurus"},
            { 20, 5, "Petro", "Taurus"},

            { 21, 5, "Mykola", "Gemini"},
            { 31, 5, "Mykola", "Gemini"},
            { 21, 6, "Ivan", "Gemini"},

            { 22, 6, "Oleksandr", "Cancer"},
            { 30, 6, "Oleksandr", "Cancer"},
            { 22, 7, "Oleksii", "Cancer"},

            { 23, 7, "Serhii", "Leo"},
            { 31, 7, "Serhii", "Leo"},
            { 22, 8, "John", "Leo"},

            { 23, 8, "Orest", "Virgo"},
            { 31, 8, "Orest", "Virgo"},
            { 22, 9, "Lubov", "Virgo"},

            { 23, 9, "Nadia", "Libra"},
            { 30, 9, "Nadia", "Libra"},
            { 22, 10, "Vira", "Libra"},

            { 23, 10, "Vasyl", "Scorpio"},
            { 31, 10, "Vasyl", "Scorpio"},
            { 22, 11, "Sviatoslav", "Scorpio"},

            { 23, 11, "Lev", "Sagittarius"},
            { 30, 11, "Lev", "Sagittarius"},
            { 21, 12, "Olesia", "Sagittarius"},

            { 22, 12, "Maria", "Capricorn"},
            { 31, 12, "Maria", "Capricorn"},
            { 20, 1, "Julia", "Capricorn"},

            { 21, 1, "Victoria", "Aquarius"},
            { 31, 1, "Secret", "Aquarius"},
            { 18, 2, "Rostyslav", "Aquarius"},

            { 19, 2, "Margo", "Pisces"},
            { 28, 2, "Secret", "Pisces"},
            { 20, 3, "Milana", "Pisces"},
    });
  }

  private final int day;
  private final int month;
  private final String name;
  private final String expectedZodiac;

  public Tests(int day, int month, String name, String expectedZodiac) {

    this.day = day;
    this.month = month;
    this.name = name;
    this.expectedZodiac = expectedZodiac;
  }


  @Test
  public void testAll() {
    // put your test here
    System.setIn(new ByteArrayInputStream(String.format("%s %s %s", day, month, name).getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();
    String expected = String.format("Hello %s. Your birthday %s/%s. So your zodiac sign is %s",
            name, day, month, expectedZodiac);

    Assert.assertEquals(expected, actual);
  }
}