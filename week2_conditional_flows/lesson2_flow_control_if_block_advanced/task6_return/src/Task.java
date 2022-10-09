import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasElectricity = scanner.nextBoolean();
        int power = scanner.nextInt();

        if (!hasElectricity) {
            System.out.println("No electricity");
            return;
        }

        if (power <= 1000) {
            System.out.println("Not enough power");
            return;
        }

        System.out.println("We are going to boil watter with cattle");
    }
}