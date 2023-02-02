import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

@RunWith(Parameterized.class)
public class Tests extends OutputRedirectionParentTest {

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {

            // 25 % discount Saturday + 40 days
            {2022, 20, 3, 30, 4, "Kyiv", "Your ticket to Kyiv on 30/4 costs 225"},
            // No discount Friday
            {2022, 20, 3, 25, 3, "Kyiv", "Your ticket to Kyiv on 25/3 costs 300"},
            // Only 10% Saturday
            {2022, 20, 3, 26, 3, "Kyiv", "Your ticket to Kyiv on 26/3 costs 270"},
            // 20 % discount Saturday + 20 days
            {2022, 20, 3, 16, 4, "Kyiv", "Your ticket to Kyiv on 16/4 costs 240"},

            // 25 % discount Saturday + 40 days
            {2022, 20, 3, 30, 4, "London", "Your ticket to London on 30/4 costs 375"},
            // No discount Friday
            {2022, 20, 3, 25, 3, "London", "Your ticket to London on 25/3 costs 500"},
            // Only 10% Saturday
            {2022, 20, 3, 26, 3, "London", "Your ticket to London on 26/3 costs 450"},
            // 20 % discount Saturday + 20 days
            {2022, 20, 3, 16, 4, "London", "Your ticket to London on 16/4 costs 400"},

            // 25 % discount Saturday + 40 days
            {2022, 20, 3, 30, 4, "Barcelona", "Your ticket to Barcelona on 30/4 costs 322"},
            // No discount Friday
            {2022, 20, 3, 25, 3, "Barcelona", "Your ticket to Barcelona on 25/3 costs 430"},
            // Only 10% Saturday
            {2022, 20, 3, 26, 3, "Barcelona", "Your ticket to Barcelona on 26/3 costs 387"},
            // 20 % discount Saturday + 20 days
            {2022, 20, 3, 16, 4, "Barcelona", "Your ticket to Barcelona on 16/4 costs 344"},

            // VALIDATION
            {2022, 20, 3, 16, 4, "Praha", "Destination not supported"},
            {2022, 20, 3, 16, 33, "Barcelona", "Flight Date invalid"},
            {2022, 37, 3, 16, 33, "London", "Current Date invalid"},
    });
  }

  int year;
  int currentDay;
  int currentMonth;
  int flightDay;
  int flightMonth;
  String destination;
  String expectedMessage;

  public Tests(int year, int currentDay, int currentMonth, int flightDay, int flightMonth,
               String destination, String expectedMessage) {
    this.year = year;
    this.currentDay = currentDay;
    this.currentMonth = currentMonth;
    this.flightDay = flightDay;
    this.flightMonth = flightMonth;
    this.destination = destination;
    this.expectedMessage = expectedMessage;
  }

  @Test
  public void testAll() {
    // put your test here
    System.setIn(new ByteArrayInputStream(String.format("%s %s %s %s %s %s",
            year, currentDay, currentMonth, flightDay, flightMonth, destination).getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString().trim();

    Assert.assertEquals(expectedMessage.trim(), actual);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();
    int currentDay = sc.nextInt();
    int currentMonth = sc.nextInt();
    int flightDay = sc.nextInt();
    int flightMonth = sc.nextInt();
    String destination = sc.next();

    long daysToFlight = getDaysBetweenDates(
            year, currentDay, currentMonth,
            year, flightDay, flightMonth);

    int weekDay = getWeekDay(year, flightDay, flightMonth);

    String pattern = String.format("Your ticket to %s on %s/%s costs ", destination, flightDay, flightMonth);

    int priceWithoutDiscount = 0;
    double discountPercent = 0;
    if (daysToFlight > 40) {
      discountPercent = 0.20;
      if (destination.equals("Kyiv")) {
        priceWithoutDiscount = 300;
        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
          discountPercent += 0.10;
        }
      } else if (destination.equals("London")) {
        priceWithoutDiscount = 300;
        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
          discountPercent += 0.10;
        }
      } else if (destination.equals("Barcelona")) {
        priceWithoutDiscount = 300;
        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
          discountPercent += 0.10;
        }
      }
    } else if (daysToFlight > 20) {
      discountPercent = 0.1;
      if (destination.equals("Kyiv")) {
        priceWithoutDiscount = 300;
        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
          discountPercent += 0.10;
          System.out.println("");
        }
      } else if (destination.equals("London")) {
        priceWithoutDiscount = 300;
        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
          discountPercent += 0.10;
        }
      } else if (destination.equals("Barcelona")) {
        priceWithoutDiscount = 300;
        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
          discountPercent += 0.10;
        }
      }
    } else {
      if (destination.equals("Kyiv")) {
        priceWithoutDiscount = 300;
        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
          discountPercent += 0.10;
        }
      } else if (destination.equals("London")) {
        priceWithoutDiscount = 300;
        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
          discountPercent += 0.10;
        }
      } else if (destination.equals("Barcelona")) {
        priceWithoutDiscount = 300;
        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
          discountPercent += 0.10;
        }
      }
    }

    double discountMax = Math.min(discountPercent, 0.25);
    int finalPrice = (int) (priceWithoutDiscount - (priceWithoutDiscount * discountMax));

    System.out.println(pattern + finalPrice);
  }

  public static long getDaysBetweenDates(int startYear, int startDay, int startMonth, int endYear, int endDay, int endMonth){
    LocalDate d1 = LocalDate.of(startYear, startMonth, startDay);
    LocalDate d2 = LocalDate.of(endYear, endMonth, endDay);
    Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
    return diff.toDays();
  }

  public static int getWeekDay(int year, int day, int month) {
    return LocalDate.of(year, month, day).getDayOfWeek().getValue();
  }
}