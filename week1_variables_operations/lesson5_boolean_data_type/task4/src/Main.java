import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int freeHoursPerDay = scanner.nextInt();
      boolean selfDiscipline = scanner.nextBoolean();
      int timeForStudyingInMonth = scanner.nextInt();
      int moneyForStudying = scanner.nextInt();
      int hoursNeededPerDay = scanner.nextInt();
      int monthsNeeded = scanner.nextInt();
      int lessonsPrice = scanner.nextInt();

      System.out.printf("freeHoursPerDay = %s, selfDiscipline = %s, timeForStudyingInMonth = %s, moneyForStudying = %s, " +
              "hoursNeededPerDay = %s, monthsNeeded = %s, lessonsPrice = %s\n",
              freeHoursPerDay, selfDiscipline, timeForStudyingInMonth, moneyForStudying, hoursNeededPerDay,
              monthsNeeded, lessonsPrice);

      boolean part1 = freeHoursPerDay >= hoursNeededPerDay && timeForStudyingInMonth >= monthsNeeded;
      boolean part2 = part1 && selfDiscipline;
      boolean part3 = part1 && moneyForStudying >= lessonsPrice;

      boolean res = part2 || part3;

      System.out.println("You can change your occupation = " + res);
   }
}