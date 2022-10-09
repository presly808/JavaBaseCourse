import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int currentWeight = scanner.nextInt();
        int desiredWeight = scanner.nextInt();

        int caloriesBurnPerDay = scanner.nextInt();
        int caloriesEatenPerDay = scanner.nextInt();

        boolean gainWeight = currentWeight < desiredWeight;
        boolean fasting = caloriesBurnPerDay < caloriesEatenPerDay;

        int daysToTarget = 0;

        System.out.printf("Input data. " +
                "Name %s, currentWeight %s, desiredWeight %s, caloriesBurnPerDay %s, caloriesEatenPerDay %s\n",
                name, currentWeight, desiredWeight, caloriesBurnPerDay, caloriesEatenPerDay);

        if (gainWeight == fasting) {
            if (gainWeight) {
                System.out.println("You are losing weight");
            } else {
                System.out.println("You are gaining weight");
            }
        } else {
            // TODO will be refactored in the next sections
            if (!gainWeight && fasting) {
                int kgNeeded = currentWeight - desiredWeight;
                double caloriesInKgPedDay = caloriesBurnPerDay * 0.00013;
                daysToTarget = (int) (kgNeeded / caloriesInKgPedDay);
            } else if (gainWeight && !fasting) {
                int kgNeeded = desiredWeight - currentWeight;
                double caloriesInKgPedDay = caloriesBurnPerDay * 0.00013;
                daysToTarget = (int) (kgNeeded / caloriesInKgPedDay);
            }
            System.out.println("You will reach the target in " + daysToTarget + " days");
        }
    }
}