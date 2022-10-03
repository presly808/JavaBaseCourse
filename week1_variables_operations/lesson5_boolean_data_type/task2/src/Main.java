import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      // Task1 Find if you can withdraw money without commission
      //    if you have a premium account and transaction amount is less than limit
      boolean isPremiumAccount = scanner.nextBoolean();
      int transactionLimit = scanner.nextInt();
      int transactionAmount = scanner.nextInt();
      boolean hasCommission = (transactionLimit > transactionAmount) && isPremiumAccount;
      System.out.printf("hasCommission = %s\n", hasCommission);

      // Task2 Will you be able to meet deadlines?
      // You can finish work on time,
      //    if you have enough time OR you can extend the estimates
      int freeTimeYouHave = scanner.nextInt();
      int projectEstimatedTime = scanner.nextInt();
      boolean canHaveExtraTime = scanner.nextBoolean();
      boolean areDeadlinesMet = (freeTimeYouHave < projectEstimatedTime) || (canHaveExtraTime);
      System.out.printf("areDeadlinesMet = %s\n", areDeadlinesMet);

      // Task3
      // Print True if two numbers are equal or numbers are even (use % operation)
      int number1 = scanner.nextInt();
      int number2 = scanner.nextInt();
      boolean evenOrEqual = (number1 == number2) || (number1 % 2 == 0 && number2 % 2 == 0);
      System.out.printf("evenOrEqual = %s", evenOrEqual);
   }
}