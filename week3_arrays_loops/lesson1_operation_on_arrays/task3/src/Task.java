import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();

        boolean valid = isDateValid(day, month);

        System.out.printf("Date is valid %s", valid);
    }
    public static int[] generateMonthDays() {
        return new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    public static boolean isDateValid(int day, int month) {

        if (month < 1 || month > 12) {
            return false;
        }

        int[] monthDays = generateMonthDays();

        return day > 0 && day <= monthDays[month - 1];
    }

}