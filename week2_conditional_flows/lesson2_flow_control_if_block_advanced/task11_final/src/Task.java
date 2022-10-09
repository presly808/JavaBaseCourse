import com.artcode.UtilsMethods;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentDay = sc.nextInt();
        int currentMonth = sc.nextInt();
        int flightDay = sc.nextInt();
        int flightMonth = sc.nextInt();
        int weekDay = sc.nextInt();
        String destination = sc.next();

        // todo how user will visualize it???
        long daysToFlight =
                UtilsMethods.getDaysBetweenDates(
                        2022, currentDay, currentMonth,
                        2022, flightDay, flightMonth);

        String pattern = String.format("Your ticket to %s on %s/%s costs ", destination, flightDay, flightMonth);

        int priceWithoutDiscount = 0;
        double discountPercent = 0;
        if (daysToFlight > 40) {
            discountPercent = 0.20;
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
        }

        double discountMax = Math.min(discountPercent, 0.25);
        int finalPrice = (int) (priceWithoutDiscount - (priceWithoutDiscount * discountMax));

        System.out.println(pattern + finalPrice);

    }
}