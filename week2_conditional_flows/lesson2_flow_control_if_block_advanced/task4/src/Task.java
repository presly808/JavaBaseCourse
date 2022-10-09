import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        String name = scanner.next();

        String halfPreparedMessage = String.format("Hello %s. Your birthday %s/%s. So your zodiac sign is ",
                name, day, month);

        if (month == 1) {
            if (day >= 1 && day <= 20) {
                System.out.print(halfPreparedMessage + "Capricorn");
            } else if (day > 20 && day <= 31){
                System.out.print(halfPreparedMessage + "Aquarius");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 18) {
                System.out.print(halfPreparedMessage + "Aquarius");
            } else if (day > 18 && day <= 28){
                System.out.print(halfPreparedMessage + "Pisces");
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20) {
                System.out.print(halfPreparedMessage + "Pisces");
            } else if (day > 20 && day <= 31){
                System.out.print(halfPreparedMessage + "Aries");
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20) {
                System.out.print(halfPreparedMessage + "Aries");
            } else if (day > 20 && day <= 30){
                System.out.print(halfPreparedMessage + "Taurus");
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 20) {
                System.out.print(halfPreparedMessage + "Taurus");
            } else if (day > 20 && day <= 31){
                System.out.print(halfPreparedMessage + "Gemini");
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 21) {
                System.out.print(halfPreparedMessage + "Gemini");
            } else if (day > 21 && day <= 30){
                System.out.print(halfPreparedMessage + "Cancer");
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22) {
                System.out.print(halfPreparedMessage + "Cancer");
            } else if (day > 22 && day <= 31){
                System.out.print(halfPreparedMessage + "Leo");
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 22) {
                System.out.print(halfPreparedMessage + "Leo");
            } else if (day > 22 && day <= 31){
                System.out.print(halfPreparedMessage + "Virgo");
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 22) {
                System.out.print(halfPreparedMessage + "Virgo");
            } else if (day > 22 && day <= 30){
                System.out.print(halfPreparedMessage + "Libra");
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 22) {
                System.out.print(halfPreparedMessage + "Libra");
            } else if (day > 22 && day <= 31){
                System.out.print(halfPreparedMessage + "Scorpio");
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 22) {
                System.out.print(halfPreparedMessage + "Scorpio");
            } else if (day > 22 && day <= 30){
                System.out.print(halfPreparedMessage + "Sagittarius");
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 21) {
                System.out.print(halfPreparedMessage + "Sagittarius");
            } else if (day > 21 && day <= 31){
                System.out.print(halfPreparedMessage + "Capricorn");
            }
        } else {
            System.out.print("Wrong Month Input");
        }
    }
}