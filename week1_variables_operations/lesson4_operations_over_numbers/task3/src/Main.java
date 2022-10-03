import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Scanner helps us to read data from the external world
      Scanner scanner = new Scanner(System.in);

      // scanners read long from some input
      long population = scanner.nextLong();

      // Reading is the same as above. The only difference is a type of result
      int x1 = scanner.nextInt();
      int y1 = scanner.nextInt();
      int x2 = scanner.nextInt();
      int y2 = scanner.nextInt();

      System.out.printf("population = %s, x1 = %s, y2 = %s, x2 = %s, y2 = %s\n",
              population, x1, y1, x2, y2);

      // Don't worry that you can not see the exact values
      // we will pass them during the check

      // Task1
      long percentage = (population * 2) / 100;
      System.out.printf("Percentage %s\n", percentage);

      // Task2 - Calculate Fraction Equation
      int partDivisor1 = x1 + x2;
      int partDividend1 = y1;

      int partDivisor2 = x1 * x2;
      int partDividend2 = y2;

      int partDivisor3 = partDivisor1 * partDividend2;
      int partDividend3 = partDividend1 * partDivisor2;

      int z1 = partDivisor3 / partDividend3;
      int z2 = partDivisor3 % partDividend3;
      int z3 = partDividend3;

      System.out.printf("z1 = %s, z2 = %s, z3 = %s", z1, z2, z3);
   }
}