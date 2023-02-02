import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String name1 = scanner.next();
      String name2 = scanner.next();

      boolean areEqual = name1.equals(name2);
      System.out.println(areEqual);

      boolean nameContains = name2.contains("Lu");
      System.out.println(nameContains);
   }
}