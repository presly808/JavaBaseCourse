import java.time.Duration;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int currentDay = sc.nextInt();
        int currentMonth = sc.nextInt();
        int flightDay = sc.nextInt();
        int flightMonth = sc.nextInt();
        String destination = sc.next();

        // Add validation for destination, month...etc
        if (currentMonth < 1 || currentMonth > 12 || currentDay < 1 || currentDay > numberOfDaysInMonth(year, currentMonth)) {
            System.out.println("Current Date invalid");
            return;
        }

        if (flightMonth < 1 || flightMonth > 12 || flightDay < 1 || flightDay > numberOfDaysInMonth(year, flightMonth)) {
            System.out.println("Flight Date invalid");
            return;
        }

        if (!destination.equals("London") && !destination.equals("Kyiv") && !destination.equals("Barcelona")) {
            System.out.println("Destination not supported");
            return;
        }

        long daysToFlight = getDaysBetweenDates(
                year, currentDay, currentMonth,
                year, flightDay, flightMonth);

        int weekDay = getWeekDay(year, flightDay, flightMonth);

        int priceWithoutDiscount = 0;
        double discountPercent = 0;

        if (weekDay == 2 || weekDay == 3 || weekDay == 6) {
            discountPercent += 0.10;
        }

        if (daysToFlight > 40) {
            discountPercent += 0.20;
        } else if (daysToFlight > 20) {
            discountPercent += 0.1;
        }

        if (destination.equals("Kyiv")) {
            priceWithoutDiscount = 300;
        } else if (destination.equals("London")) {
            priceWithoutDiscount = 500;
        } else if (destination.equals("Barcelona")) {
            priceWithoutDiscount = 430;
        }

        double discountMax = Math.min(discountPercent, 0.25);
        int finalPrice = (int) (priceWithoutDiscount - (priceWithoutDiscount * discountMax));

        String pattern = String.format("Your ticket to %s on %s/%s costs %s",
                destination, flightDay, flightMonth, finalPrice);
        System.out.println(pattern);
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

    public static int numberOfDaysInMonth(int year, int month) {
        return YearMonth.of(year, month).lengthOfMonth();
    }
}